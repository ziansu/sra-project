public void setPaths(java.lang.String paths, java.lang.String separator) {
    java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(paths, separator);
    while (tokenizer.hasMoreTokens()) {
        list.add(tokenizer.nextToken());
    } 
    setPaths(list);
}