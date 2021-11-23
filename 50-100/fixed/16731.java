public static void main(java.lang.String[] args) {
    tweetservlet.TweetCrawler ts = new tweetservlet.TweetCrawler();
    java.lang.String tweets = ts.getTweets(new tweetservlet.Location(48.20732F, 16.373793F), null, "photo", false);
    java.lang.System.out.print(tweets);
    java.lang.System.out.println("\n\nCOMPARISON TEST\n\n");
    java.lang.String expandedUrl = "youtube.com";
    java.lang.System.out.println(("expanded url contains: " + (expandedUrl.contains("youtube") ? "yep" : "nope")));
}