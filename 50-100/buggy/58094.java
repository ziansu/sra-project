public java.util.Map<java.lang.String, java.lang.Object> getProperties() {
    final java.util.Map<java.lang.String, java.lang.Object> map = new java.util.HashMap<java.lang.String, java.lang.Object>();
    for (final org.mihalis.opal.propertyTable.PTProperty prop : this.properties) {
        map.put(prop.getName(), prop.getValue());
    }
    return map;
}