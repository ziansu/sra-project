private java.lang.String getStationLookup(java.lang.String stationID) throws java.sql.SQLException {
    java.lang.String sql = (((("Select * from " + (de.bund.bfr.knime.openkrise.db.DBKernel.delimitL("Station"))) + " WHERE ") + (de.bund.bfr.knime.openkrise.db.DBKernel.delimitL("ID"))) + "=") + stationID;
    java.sql.ResultSet rs = de.bund.bfr.knime.openkrise.db.DBKernel.getResultSet(sql, false);
    if ((rs != null) && (rs.first())) {
        return getStationLookup(rs, "Station");
    }
    return null;
}