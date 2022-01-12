public void createDwarfData(com.Jessy1237.DwarfCraft.DCPlayer dCPlayer) {
    try {
        java.sql.PreparedStatement prep = mDBCon.prepareStatement("insert into players(uuid, race) values(?,?);");
        prep.setString(1, dCPlayer.getPlayer().getUniqueId().toString());
        prep.setString(2, plugin.getConfigManager().getDefaultRace().trim());
        prep.execute();
        prep.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}