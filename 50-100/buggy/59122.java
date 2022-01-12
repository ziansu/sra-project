@java.lang.SuppressWarnings(value = "unchecked")
private java.util.List<java.util.Map<java.lang.String, ?>> extractMapList(java.lang.Object[] arr) {
    java.util.List<java.util.Map<java.lang.String, ?>> mapList = com.google.common.collect.Lists.newArrayList();
    for (java.lang.Object o : arr) {
        if (o instanceof java.util.Map) {
            java.util.Map<java.lang.String, ?> m = ((java.util.Map<java.lang.String, ?>) (o));
            mapList.add(m);
        }
    }
    return mapList;
}