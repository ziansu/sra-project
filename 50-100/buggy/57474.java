private void entry() {
    for (int i = 0; i < (twit.Solver.tweetCount); i++) {
        int indexCategory = tweetCategory.get(i);
        if (indexCategory == (-1)) {
            indexCategory = (categories.size()) - 1;
        }
        categories.get(indexCategory).addTweets(tweets.get(i));
    }
}