public java.util.List<java.lang.String> getListCriteria() {
    java.util.List<java.lang.String> list = new java.util.ArrayList<>();
    for (java.util.Map.Entry<E, java.lang.Object> entry : criteria.entrySet()) {
        java.lang.String value = entry.getValue().toString().trim();
        list.add((((entry.getKey()) + "=") + value));
    }
    return list;
}