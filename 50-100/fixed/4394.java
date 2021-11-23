private java.io.File[] readFileList(java.io.File file) throws java.io.IOException {
    java.util.List<java.io.File> fileList = new java.util.ArrayList<>();
    java.io.FileReader fileReader = new java.io.FileReader(file);
    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
    java.lang.String line;
    while ((line = bufferedReader.readLine()) != null) {
        fileList.add(new java.io.File(line.trim()));
    } 
    return fileList.toArray(new java.io.File[fileList.size()]);
}