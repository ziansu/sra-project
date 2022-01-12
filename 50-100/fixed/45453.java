public boolean isAvailableFor(java.lang.Object object) {
    if ((property1) instanceof org.minimalj.model.properties.ChainedProperty) {
        if (!(((org.minimalj.model.properties.ChainedProperty) (property1)).isAvailableFor(object))) {
            return false;
        }
    }
    return (property1.getValue(object)) != null;
}