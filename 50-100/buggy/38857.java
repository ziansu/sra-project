private java.util.List<java.lang.String> find() {
    if (!(list.isEmpty())) {
        return list;
    }
    final java.lang.String classpath = getClassPath();
    if ((prefix) != null) {
        search(prefix);
    }
    final java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(classpath, java.io.File.pathSeparator);
    while (tokenizer.hasMoreTokens()) {
        search(tokenizer.nextToken());
    } 
    return this.list;
}