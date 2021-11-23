private void buildDictionary() {
    try {
        java.io.BufferedReader fileReader = new java.io.BufferedReader(new ScrabbleTeam3.fileReader(ScrabbleTeam3.ScrabbleWordSuggester.FILE_PATH));
        java.lang.String sortedWordd = "";
        while ((nextWord = fileReader.readLine()) != null) {
            sortedWord = ScrabbleTeam3.ScrabbleWordSuggester.getWordSortedByCharacter(nextWord);
            ScrabbleTeam3.ScrabbleWordSuggester.addtoDictionary(sortedWord, nextWord);
        } 
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
}