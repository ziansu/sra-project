private static void initRecessiveCarrierMap() {
    try {
        java.lang.String sql = "SELECT * From " + (function.external.knownvar.KnownVarManager.recessiveCarrierTable);
        java.sql.ResultSet rs = utils.DBManager.executeQuery(sql);
        while (rs.next()) {
            java.lang.String geneName = rs.getString("geneName");
            function.external.knownvar.KnownVarManager.recessiveCarrierSet.add(geneName);
        } 
        rs.close();
    } catch (java.lang.Exception e) {
        utils.ErrorManager.send(e);
    }
}