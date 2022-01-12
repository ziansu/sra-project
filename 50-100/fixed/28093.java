public java.util.List<java.lang.Integer> findLetterIndices(char letter) {
    java.lang.String lowerWord = _wordStr.toLowerCase();
    char lowerLetter = java.lang.Character.toLowerCase(letter);
    java.util.ArrayList<java.lang.Integer> foundIndices = new java.util.ArrayList<>();
    int ind = lowerWord.indexOf(lowerLetter);
    while (ind >= 0) {
        foundIndices.add(ind);
        ind = lowerWord.indexOf(lowerLetter, (ind + 1));
    } 
    return foundIndices;
}