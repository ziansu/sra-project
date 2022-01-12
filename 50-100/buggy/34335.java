public java.lang.String[] readLines(java.lang.String filename) throws java.io.IOException {
    java.io.FileReader fileReader = new java.io.FileReader(filename);
    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
    java.util.List<java.lang.String> lines = new java.util.ArrayList<java.lang.String>();
    java.lang.String line = null;
    while ((line = bufferedReader.readLine()) != null) {
        java.lang.System.out.println(line);
        lines.add(line);
    } 
    bufferedReader.close();
    return lines.toArray(new java.lang.String[lines.size()]);
}