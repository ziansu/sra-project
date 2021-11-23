private java.util.List<java.lang.String> find() {
    if ((prefix) != null) {
        search(prefix);
    }else {
        final java.lang.String classpath = getClassPath();
        final java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(classpath, java.io.File.pathSeparator);
        while (tokenizer.hasMoreTokens()) {
            search(tokenizer.nextToken());
        } 
    }
    return list;
}