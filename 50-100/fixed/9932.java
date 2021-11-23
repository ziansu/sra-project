public boolean appendToFile(java.lang.String s) {
    try {
        java.nio.file.Files.write(this.f.toPath(), s.getBytes(), java.nio.file.StandardOpenOption.APPEND);
        return true;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return false;
}