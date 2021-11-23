public int compare(java.lang.String problemA, java.lang.String problemB) {
    java.lang.String valueA = map.get(problemA).get(key);
    java.lang.String valueB = map.get(problemB).get(key);
    return (java.lang.Integer.parseInt(valueA)) - (java.lang.Integer.parseInt(valueB));
}