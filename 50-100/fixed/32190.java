private void buildDictionary() throws java.io.IOException {
    try {
        java.io.BufferedReader fileReader = new java.io.BufferedReader(new java.io.FileReader(ScrabbleTeam3.ScrabbleWordSuggester.FILE_PATH));
        java.lang.String nextWord;
        java.lang.String sortedWord = "";
        while ((nextWord = fileReader.readLine()) != null) {
            sortedWord = getWordSortedByCharacter(nextWord);
            addtoDictionary(sortedWord, nextWord);
        } 
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
}