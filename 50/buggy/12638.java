private double getLowestPrice(java.util.List<java.lang.Double> list) {
    java.util.Collections.sort(list);
    return list.get(0);
}