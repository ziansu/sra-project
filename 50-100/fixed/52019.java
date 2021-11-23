public static void loadArray(java.io.FileReader inputFile, java.util.ArrayList<java.lang.String> text) throws java.io.IOException {
    java.lang.String line;
    java.io.BufferedReader br = new java.io.BufferedReader(inputFile);
    while ((line = br.readLine()) != null) {
        text.add(line);
    } 
}