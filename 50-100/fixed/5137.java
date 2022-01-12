@com.fasterxml.jackson.annotation.JsonGetter
public java.util.List<java.lang.String> getPropertiesId() {
    java.util.List<java.lang.String> idList = new java.util.ArrayList<>();
    java.util.List<com.isssr.foodemperors.model.Property> propertyList = getPropertyList();
    if (propertyList == null) {
        return null;
    }
    for (com.isssr.foodemperors.model.Property property : propertyList) {
        if (property != null) {
            idList.add(property.getId());
        }
    }
    if ((idList.size()) > 0) {
        return idList;
    }else {
        return null;
    }
}