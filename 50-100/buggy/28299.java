private void loadTextFile(java.lang.String fileName, javax.swing.JTextArea control) {
    java.io.BufferedReader buffer;
    try {
        java.io.InputStream in = getClass().getResourceAsStream(("/" + fileName));
        if (in != null) {
            buffer = new java.io.BufferedReader(new java.io.InputStreamReader(in));
            control.read(buffer, null);
            buffer.close();
        }
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}