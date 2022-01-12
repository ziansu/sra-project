private java.lang.String getStoreIdentifierFromVorlageneigenschaften(org.goobi.production.importer.FireburnProperty p) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.lang.String vorlagenId = getVorlagenId(p);
    if (vorlagenId != null) {
        java.lang.String sql = ("SELECT ProzesseID FROM vorlagen WHERE VorlagenID='" + vorlagenId) + "';";
        java.sql.ResultSet rs = this.stmt.executeQuery(sql);
        java.lang.String processId = null;
        if (rs.next()) {
            processId = rs.getString("prozesseID");
        }
        if (processId != null) {
            return processId;
        }
    }
    return null;
}