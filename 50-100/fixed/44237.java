private void findWordInString(com.nordstrom.core.wordchecker.dto.GameWord word, java.lang.String stringToSearch, int rowIndex, com.nordstrom.core.wordchecker.dto.LetterGrid.Orientation orientation) {
    int index;
    while ((index = stringToSearch.indexOf(word.getValue())) >= 0) {
        word.addLocation(new com.nordstrom.core.wordchecker.dto.GameWord.WordLocation(rowIndex, index, orientation));
        stringToSearch = stringToSearch.substring((index + (word.getValue().length())));
    } 
}