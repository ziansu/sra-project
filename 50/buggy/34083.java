java.lang.String selectRandomWordUsingRandomNumber(int randomNumber) {
    java.lang.String[] wordsFromFile = getResources().getStringArray(R.array.words);
    java.lang.String selectedRandomWord = wordsFromFile[randomNumber];
    selectedWordCharArray = selectedRandomWord.toCharArray();
    return selectedRandomWord;
}