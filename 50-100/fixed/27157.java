public void setProperty(java.lang.String predicate, java.lang.String language, java.lang.String value) {
    if (properties.containsKey(predicate)) {
        properties.get(predicate).setValue(language, value);
    }else {
        fi.thl.pivot.model.Label property = new fi.thl.pivot.model.Label();
        property.setValue(language, value);
        properties.put(predicate, property);
    }
}