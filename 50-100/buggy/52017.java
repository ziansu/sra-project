public static boolean getSwitch(java.lang.String player) {
    boolean isOn = false;
    java.lang.String sql = java.lang.String.format("SELECT %s FROM %s WHERE %s = \"%s\";", com.gmail.edenthink.general.GeneralData.IS_SWITCH, com.gmail.edenthink.general.GeneralData.TABLE, com.gmail.edenthink.general.GeneralData.NAME, player);
    try (java.sql.Statement s = com.gmail.edenthink.tools.Driver.getConnection().createStatement()) {
        try (java.sql.ResultSet set = s.executeQuery(sql)) {
            if (set.next()) {
                isOn = set.getBoolean(com.gmail.edenthink.general.GeneralData.IS_SWITCH);
            }
        }
    } catch (java.sql.SQLException e) {
        com.gmail.edenthink.tools.Util.printSQLError(e);
    }
    return isOn;
}