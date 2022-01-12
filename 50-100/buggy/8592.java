private static void sortData(final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> dataList, final java.lang.String key) {
    java.util.Collections.sort(dataList, ( map1, map2) -> {
        return (java.lang.Double.valueOf(map1.get(key).toString())) <= (java.lang.Double.valueOf(map2.get(key).toString())) ? 1 : -1;
    });
}