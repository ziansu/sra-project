public java.lang.String getMostCommonWord() {
    gatherTheTweets(username);
    turnTweetsToWords();
    removeBoringWords();
    removeBlankWords();
    java.lang.String information = (("The tweetcount is " + (allTheTweets.size())) + "and the word count after removal is") + (tweetedWords.size());
    return "";
}