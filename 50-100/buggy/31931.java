public <T> java.util.List<T> last(java.util.List<T> ds, int num) {
    java.util.List<T> res = new java.util.ArrayList<T>();
    int start = (ds.size()) - num;
    for (int i = start; i < (ds.size()); i++) {
        res.add(ds.get(i));
    }
    return res;
}