public void addList(java.lang.String value, java.lang.String... keys) {
    java.util.List<java.lang.String> list = java.util.Arrays.asList(keys);
    java.lang.System.out.println(list);
    vals.put(list, value);
}