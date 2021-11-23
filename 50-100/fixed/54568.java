public java.lang.String getPropertyNameInSolr(java.lang.String repositoryId, java.lang.String cmisColName) {
    java.lang.String val = map.get(cmisColName);
    jp.aegif.nemaki.model.NemakiPropertyDefinitionCore pd = typeService.getPropertyDefinitionCoreByPropertyId(repositoryId, cmisColName);
    if (val == null) {
        if (pd.getPropertyType().equals(PropertyType.DATETIME)) {
            val = "dynamicDate.property." + cmisColName;
        }else {
            val = "dynamic.property." + cmisColName;
        }
    }
    return val;
}