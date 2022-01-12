private void addToMap(java.lang.String name, java.util.Map<java.lang.String, java.lang.Object> map, ezvcard.property.TextListProperty categories) {
    final java.util.List<java.lang.String> textProperties = categories.getValues();
    java.util.Collections.sort(textProperties);
    for (int i = 0; i < (textProperties.size()); i++) {
        map.put((((name + "[") + i) + "]"), textProperties.get(i));
    }
}