public java.lang.String correctTweet(java.lang.String user) {
    java.util.List<java.lang.String> word = parsing.ParseTweet.getTweetWords(parsing.ParseTweet.getLatestTweet(user));
    java.lang.String correctedTweet = "";
    for (int i = 0; i < (word.size()); i++) {
        correctedTweet += (f.wordRecommend(word.get(i))) + " ";
    }
    return correctedTweet;
}