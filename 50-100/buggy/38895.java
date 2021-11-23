private java.util.ArrayList<java.lang.String> getList() {
    java.util.TreeSet<java.lang.Integer> set = new java.util.TreeSet<>();
    set = adapter.getSelectedIndices();
    java.util.ArrayList<java.lang.String> list = new java.util.ArrayList<>();
    for (int i : set) {
        list.add(paths.get(i));
    }
    return list;
}