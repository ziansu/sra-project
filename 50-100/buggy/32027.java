public java.util.List<gov.anl.aps.cdb.portal.model.db.entities.PropertyValue> getRelatedPropertyValueList() {
    if ((relatedPropertyValueList) == null) {
        relatedPropertyValueList = new java.util.ArrayList<>();
        for (gov.anl.aps.cdb.portal.model.db.entities.PropertyValue propertyValue : item.getPropertyValueList()) {
            if (propertyValue.getPropertyType().equals(propertyType)) {
                relatedPropertyValueList.add(propertyValue);
            }
        }
    }
    return relatedPropertyValueList;
}