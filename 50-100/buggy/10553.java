private java.util.List<java.lang.String> pick(java.util.HashMap<java.lang.String, java.lang.Integer> map, int n) {
    wedt.finder.ActualWikiFinder.ValueComparator bvc = new wedt.finder.ActualWikiFinder.ValueComparator(map);
    java.util.TreeMap<java.lang.String, java.lang.Integer> sorted = new java.util.TreeMap<>(bvc);
    sorted.putAll(map);
    java.util.ArrayList<java.lang.String> keys = new java.util.ArrayList<>();
    keys.addAll(sorted.keySet());
    return keys.subList(0, n);
}