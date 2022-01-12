public void loadFile(java.lang.Class<?> basePackage, java.lang.String fileName) {
    java.lang.String base = basePackage.getPackage().getName().replace(".", "/");
    java.lang.String file = (fileName.startsWith("/")) ? fileName : "/" + fileName;
    loadFile((base + file));
}