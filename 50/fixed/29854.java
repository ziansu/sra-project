private double getHighestPrice(java.util.List<java.lang.Double> list) {
    java.util.List<java.lang.Double> temp = new java.util.ArrayList<>(list);
    java.util.Collections.sort(temp, java.util.Collections.<java.lang.Double>reverseOrder());
    return temp.get(0);
}