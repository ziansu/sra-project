@java.lang.Override
protected boolean prepareSwitchToUpdateNewItemsActiveIndex() {
    if (super.prepareSwitchToUpdateNewItemsActiveIndex()) {
        java.util.List<gov.anl.aps.cdb.portal.model.db.entities.PropertyType> propertyTypes = getPropertyTypesRequiredForMultiCreate();
        setSelectedPropertyTypesForEditing(propertyTypes);
        for (gov.anl.aps.cdb.portal.model.db.entities.PropertyType propertyType : propertyTypes) {
            addPropertyTypeToRestItems(propertyType);
        }
        return true;
    }
    return false;
}