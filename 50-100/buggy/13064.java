private void analyzeAssociations(org.litepal.crud.DataSupport baseObj) {
    try {
        java.util.Collection<org.litepal.crud.model.AssociationsInfo> associationInfos = getAssociationInfo(baseObj.getClassName());
        analyzeAssociatedModels(baseObj, associationInfos);
    } catch (java.lang.Exception e) {
        throw new org.litepal.exceptions.DataSupportException(e.getMessage());
    }
}