public void addList(java.lang.String value, java.lang.String... keys) {
    java.util.List<java.lang.String> list = java.util.Arrays.asList(keys);
    vals.put(list, value);
    java.lang.System.out.println(vals);
}