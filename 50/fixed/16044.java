private static java.lang.Double average(java.util.List<java.lang.Integer> list) {
    java.lang.Double sum = 0.0;
    for (java.lang.Integer i : list) {
        sum += i;
    }
    return sum / (list.size());
}