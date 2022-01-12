public int compare(java.lang.String problemA, java.lang.String problemB) {
    java.lang.String valueA = map.get(problemA).get(key);
    java.lang.String valueB = map.get(problemB).get(key);
    int result = (java.lang.Integer.parseInt(valueA)) - (java.lang.Integer.parseInt(valueB));
    if (result == 0) {
        return 1;
    }else {
        return result;
    }
}