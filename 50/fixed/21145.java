public void closeOutput() {
    try {
        outputStream.close();
    } catch (java.io.IOException e) {
        java.lang.System.out.println(e.toString());
    }
}