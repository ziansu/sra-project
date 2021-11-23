public void append(java.lang.String str) {
    try {
        writer.write(str);
        writer.flush();
    } catch (java.io.IOException e) {
        exceptionThrown(e);
    }
}