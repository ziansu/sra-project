public static java.util.List<java.lang.String> recover(java.util.List<java.lang.Integer> values, java.util.List<java.lang.String> map) {
    java.util.List<java.lang.String> result = new java.util.ArrayList<>(values.size());
    for (int i : nl.peterbloem.kit.Series.series(values.size()))
        result.add(map.get(i));
    
    return result;
}