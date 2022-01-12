private static void initAdultOnsetMap() {
    try {
        java.lang.String sql = "SELECT * From " + (function.external.knownvar.KnownVarManager.adultOnsetTable);
        java.sql.ResultSet rs = utils.DBManager.executeQuery(sql);
        while (rs.next()) {
            java.lang.String geneName = rs.getString("geneName");
            java.lang.String adultOnset = rs.getString("AdultOnset");
            function.external.knownvar.KnownVarManager.adultOnsetMap.put(geneName, adultOnset);
        } 
        rs.close();
    } catch (java.lang.Exception e) {
        utils.ErrorManager.send(e);
    }
}