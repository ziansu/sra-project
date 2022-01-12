public void writeFile(java.io.File file, java.lang.String text) throws java.io.IOException {
    java.io.FileWriter fileWriter = null;
    try {
        fileWriter = new java.io.FileWriter(file);
        fileWriter.write(text);
        fileWriter.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } finally {
        if (fileWriter != null)
            fileWriter.close();
        
    }
}