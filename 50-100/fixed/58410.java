private java.util.List<java.lang.String> fileListToStringList(java.io.File[] files) {
    java.util.List<java.lang.String> strings = new java.util.ArrayList<>();
    for (java.io.File i : files) {
        strings.add(i.getName());
    }
    return strings;
}