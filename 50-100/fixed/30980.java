public void removeBlankWords() {
    for (int index = 0; index < (allTheTweets.size()); index++) {
        if (tweetedWords.get(index).trim().equals("")) {
            tweetedWords.remove(index);
            index--;
        }
    }
}