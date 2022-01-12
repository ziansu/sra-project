public void writeFile() {
    try {
        java.io.FileWriter w = new java.io.FileWriter(fileName, true);
        w.write(toString());
        w.flush();
        w.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}