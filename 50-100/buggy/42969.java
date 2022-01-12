public final boolean load(java.lang.String filePath) {
    byte[] buffer;
    try {
        java.io.BufferedInputStream stream = new java.io.BufferedInputStream(new java.io.FileInputStream(filePath));
        buffer = new byte[stream.available()];
        stream.read(buffer);
        stream.close();
        java.lang.String content = new java.lang.String(buffer);
        eval(content);
        return true;
    } catch (java.io.FileNotFoundException e) {
        java.lang.System.err.println("Could not find specified file");
    } catch (java.io.IOException e) {
        return false;
    }
    return false;
}