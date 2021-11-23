private static void writeFile(java.lang.String path, java.lang.String name, java.lang.String content) {
    try {
        java.io.File file = new java.io.File(((path + (rope1401.RopeUtils.separator)) + name));
        java.io.Writer output = new java.io.BufferedWriter(new java.io.FileWriter(file));
        output.write(content);
        output.close();
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}