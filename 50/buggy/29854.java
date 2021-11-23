private double getHighestPrice(java.util.List<java.lang.Double> list) {
    java.util.Collections.sort(list, java.util.Collections.<java.lang.Double>reverseOrder());
    return list.get(0);
}