public java.util.List<java.lang.String> getListCriteria() {
    java.util.List<java.lang.String> list = new java.util.ArrayList<>();
    for (java.util.Map.Entry<E, java.lang.Object> entry : criteria.entrySet()) {
        list.add((((entry.getKey()) + "=") + (entry.getValue())));
    }
    return list;
}