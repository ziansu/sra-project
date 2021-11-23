private java.lang.String getStoreIdentifierFromVorlageneigenschaften(org.goobi.production.importer.FireburnProperty p) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.lang.String vorlagenId = getVorlagenId(p);
    java.lang.String processId = null;
    if (vorlagenId != null) {
        java.lang.String sql = ("SELECT ProzesseID FROM vorlagen WHERE VorlagenID='" + vorlagenId) + "';";
        try (java.sql.ResultSet rs = this.stmt.executeQuery(sql)) {
            if (rs.next()) {
                processId = rs.getString("prozesseID");
            }
        }
    }
    return processId;
}