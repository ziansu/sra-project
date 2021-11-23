private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> extractMapList(java.lang.Object[] arr) {
    java.util.List<java.util.Map<java.lang.String, java.lang.Object>> mapList = com.google.common.collect.Lists.newArrayList();
    for (java.lang.Object o : arr) {
        if (o instanceof java.util.Map) {
            mapList.add(((java.util.Map<java.lang.String, java.lang.Object>) (o)));
        }
    }
    return mapList;
}