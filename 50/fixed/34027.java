public void replaceLetter(com.rostifar.scrabbleproject.ScrabbleLetter letterToReplace) {
    word.add(word.indexOf(getBlankLetter()), letterToReplace);
    word.remove(getBlankLetter());
}