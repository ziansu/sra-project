public static void removeBan(java.lang.String uuid) {
    if (de.lordvader.Punisher.Util.MySql.isPlayerBanned(uuid)) {
        java.sql.PreparedStatement ps = null;
        try {
            ps = de.lordvader.Punisher.Util.MySql.getConnection().prepareStatement("DELETE FROM bans WHERE uuid = ?");
            ps.setString(1, uuid);
            ps.execute();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
}