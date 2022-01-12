private java.util.Map<java.lang.String, gov.usgs.cida.coastalhazards.model.Item> makeChildItemMap(java.util.List<gov.usgs.cida.coastalhazards.model.Item> children) {
    java.util.Map<java.lang.String, gov.usgs.cida.coastalhazards.model.Item> result = new java.util.LinkedHashMap<>();
    if (children != null) {
        for (gov.usgs.cida.coastalhazards.model.Item item : children) {
            result.put(item.getId(), item);
        }
    }
    return result;
}