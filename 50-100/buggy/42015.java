public java.lang.String getAttributeValueForCode(java.lang.String tableName, java.lang.String operatorName, java.lang.String attributeGroupCode, java.lang.String attributeCode) throws java.lang.Exception {
    java.lang.String attributeValue = null;
    try {
        attributeValue = apiDAO.getAttributeValueForCode(tableName, operatorName, attributeGroupCode, attributeCode);
    } catch (java.lang.Exception ex) {
        log.error("Error while retrieving attribute value");
        throw ex;
    }
    return attributeValue;
}