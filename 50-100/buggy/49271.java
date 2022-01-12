public java.lang.String correctTweet(java.lang.String user) {
    java.util.List<java.lang.String> word = parsing.ParseTweet.getTweetWords(parsing.ParseTweet.getLatestTweet(user));
    java.lang.String correctedTweet = "";
    for (int k = 0; k < (word.size()); k++) {
        correctedTweet = (correctedTweet + (searching.Finder.wordRecommend(word.get(k)))) + " ";
    }
    return correctedTweet;
}