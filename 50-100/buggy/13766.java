public void updateViews(java.lang.String word) {
    java.lang.String wordList = tvWordList.getText().toString();
    wordList = (wordList + " \n") + word;
    if ((dictionary.getIndex()) >= (dictionary.getCount())) {
        setTextViews(wordList, "Enter new word");
    }else
        setTextViews(wordList, "Enter sequence!");
    
}