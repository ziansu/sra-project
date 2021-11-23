public <T> java.util.List<T> first(java.util.List<T> ds, int num) {
    java.util.List<T> res = new java.util.ArrayList<T>();
    for (int i = 0; i < num; i++) {
        res.add(ds.get(i));
    }
    return res;
}