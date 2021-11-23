public java.util.List<T> find(java.lang.String hql, java.lang.Object param) {
    java.util.List<java.lang.Object> params = new java.util.ArrayList<>();
    params.add(param);
    return find(hql, null, params);
}