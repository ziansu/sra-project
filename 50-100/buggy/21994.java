private void removeBlankWords() {
    for (int index = 0; index < (tweetedWords.size()); index++) {
        if (tweetedWords.get(index).trim().equals("")) {
            tweetedWords.remove(index);
            index--;
            blankIndex = blankWords.length;
        }
    }
}