public java.util.List<java.lang.Double> toDoubleList() {
    java.util.List<java.lang.Double> list = new java.util.LinkedList<java.lang.Double>();
    list.add(java.lang.Double.valueOf(latitude));
    list.add(java.lang.Double.valueOf(longitude));
    return list;
}