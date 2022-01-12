private java.util.Map<java.lang.String, org.sputnikdev.bluetooth.gattparser.FieldHolder> getHolders(java.util.List<org.sputnikdev.bluetooth.gattparser.spec.Field> fields) {
    java.util.Map<java.lang.String, org.sputnikdev.bluetooth.gattparser.FieldHolder> result = new java.util.LinkedHashMap<>();
    int index = 0;
    for (org.sputnikdev.bluetooth.gattparser.spec.Field field : fields) {
        result.put(field.getName(), new org.sputnikdev.bluetooth.gattparser.FieldHolder(field, (index++)));
    }
    return java.util.Collections.unmodifiableMap(result);
}