private void writeToFile(java.lang.String fileName, java.lang.String fileContent) {
    try {
        java.io.File file = new java.io.File(fileName);
        if (!(file.exists())) {
            file.createNewFile();
        }
        java.io.FileWriter fw = new java.io.FileWriter(file.getAbsoluteFile());
        java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
        bw.write(fileContent);
        bw.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}