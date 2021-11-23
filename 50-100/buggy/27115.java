public void writeFile(int i) {
    try {
        java.io.FileWriter w = new java.io.FileWriter(fileName, true);
        w.write(toString(i));
        w.flush();
        w.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}