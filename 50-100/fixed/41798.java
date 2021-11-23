private void processList(java.lang.String listName, com.moandjiezana.toml.Toml toml, int[] arr) {
    java.util.List<java.lang.Long> list = toml.getList(listName);
    if ((list == null) || ((list.size()) == 0)) {
        return ;
    }
    for (int i = 0; i < (arr.length); i++) {
        arr[i] = list.get(i).intValue();
    }
}