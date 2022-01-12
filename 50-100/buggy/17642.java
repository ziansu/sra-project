public void writeFile(java.io.File file, java.lang.String text) {
    try {
        java.io.FileWriter fileWriter = null;
        fileWriter = new java.io.FileWriter(file);
        fileWriter.write(text);
        fileWriter.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}