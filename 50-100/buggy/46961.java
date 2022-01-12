public java.lang.String readAsString(java.io.File file) throws java.io.FileNotFoundException, java.io.IOException {
    java.lang.StringBuffer contents = new java.lang.StringBuffer();
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(file));
    java.lang.String line;
    while ((line = reader.readLine()) != null)
        contents.append(line);
    
    reader.close();
    return new java.lang.String(contents);
}