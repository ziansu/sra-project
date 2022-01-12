private static java.util.ArrayList<java.lang.String> fetchFromFile(java.lang.String filePath) throws java.io.IOException {
    java.io.File f = new java.io.File(filePath);
    java.io.FileReader reader = new java.io.FileReader(f);
    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(reader);
    java.lang.String line;
    while ((line = bufferedReader.readLine()) != null) {
        tdnext.StorageAPI.data.add(line);
    } 
    reader.close();
    return tdnext.StorageAPI.data;
}