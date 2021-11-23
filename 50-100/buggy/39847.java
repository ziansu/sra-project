public java.io.File createTempJavaFile(java.lang.String editorText) throws java.io.IOException {
    java.io.File javaFile = new java.io.File("temp.java");
    javaFile.deleteOnExit();
    java.io.FileWriter fileWriter;
    try {
        fileWriter = new java.io.FileWriter(javaFile);
        fileWriter.write(editorText);
        fileWriter.close();
    } catch (java.io.IOException e) {
        throw new java.io.IOException("Could not create temp java file.");
    }
    return javaFile;
}