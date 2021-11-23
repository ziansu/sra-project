public static boolean getSwitch(java.lang.String player) {
    int isOn = 0;
    java.lang.String sql = java.lang.String.format("SELECT %s FROM %s WHERE %s = \"%s\";", com.gmail.edenthink.general.GeneralData.IS_SWITCH, com.gmail.edenthink.general.GeneralData.TABLE, com.gmail.edenthink.general.GeneralData.NAME, player);
    try (java.sql.Statement s = com.gmail.edenthink.tools.Driver.getConnection().createStatement()) {
        try (java.sql.ResultSet set = s.executeQuery(sql)) {
            if (set.next()) {
                isOn = set.getInt(com.gmail.edenthink.general.GeneralData.IS_SWITCH);
            }
        }
    } catch (java.sql.SQLException e) {
        com.gmail.edenthink.tools.Util.printSQLError(e);
    }
    return isOn == 1;
}