private java.util.Set<java.lang.String> getInstance(java.lang.String filePath) throws java.io.IOException {
    if ((guesswords.Dictionary.legalWords) == null) {
        guesswords.Dictionary.legalWords = new java.util.TreeSet<>();
        java.io.FileReader file = new java.io.FileReader(filePath);
        java.io.BufferedReader reader = new java.io.BufferedReader(file);
        java.util.List<java.lang.String> lines = new java.util.ArrayList<>();
        java.lang.String singleLine = "";
        while ((singleLine = reader.readLine()) != null) {
            guesswords.Dictionary.legalWords.add(singleLine.toLowerCase());
        } 
    }
    return guesswords.Dictionary.legalWords;
}