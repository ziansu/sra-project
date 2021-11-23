public void update(java.lang.String newText) throws java.io.FileNotFoundException {
    try {
        existFile();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    java.lang.String oldFile = read();
    sb.append(oldFile);
    sb.append(newText);
    write(sb.toString());
}