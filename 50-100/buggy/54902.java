public static void setSession(java.lang.String UUID2, java.lang.String time) throws java.sql.SQLException {
    com.myththewolf.MythBans.lib.player.MythPlayer.ps = ((java.sql.PreparedStatement) (com.myththewolf.MythBans.lib.SQL.MythSQLConnect.getConnection().prepareStatement("UPDATE MythBans_PlayerStats SET session_start = ?  WHERE UUID = ?")));
    com.myththewolf.MythBans.lib.player.MythPlayer.ps.setString(2, UUID2);
    com.myththewolf.MythBans.lib.player.MythPlayer.ps.setString(1, time);
    com.myththewolf.MythBans.lib.player.MythPlayer.ps.executeUpdate();
    com.myththewolf.MythBans.lib.feilds.PlayerDataCache.rebuildUser(com.myththewolf.MythBans.lib.player.MythPlayer.UUID);
    java.lang.System.out.println(("UPDATING SESSION:::" + time));
}