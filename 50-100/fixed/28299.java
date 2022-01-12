private void loadTextFile(java.lang.String fileName, javax.swing.JTextArea control) {
    java.io.BufferedReader buffer;
    try {
        buffer = new java.io.BufferedReader(new java.io.FileReader(fileName));
        control.read(buffer, null);
        buffer.close();
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}