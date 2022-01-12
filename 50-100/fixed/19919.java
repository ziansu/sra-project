private nl.uva.cs.lobcder.resources.LogicalData inheritProperties(nl.uva.cs.lobcder.resources.LogicalData fileLogicalData, java.sql.Connection connection) throws java.sql.SQLException {
    java.lang.String value = ((java.lang.String) (getProperty(Constants.DATA_LOC_PREF_NAME)));
    if (value != null) {
        java.util.List<java.lang.String> list = property2List(value);
        list = getCatalogue().setLocationPreferences(connection, fileLogicalData.getUid(), list, getPrincipal().isAdmin());
        fileLogicalData.setDataLocationPreferences(list);
    }else {
    }
    return fileLogicalData;
}