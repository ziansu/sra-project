public void saveContent(java.lang.String content) throws java.io.IOException {
    java.io.FileOutputStream o = new java.io.FileOutputStream(file);
    for (int i = 0; i < (content.length()); i += 1) {
        o.write(content.charAt(i));
    }
}