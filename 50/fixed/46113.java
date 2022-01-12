public static void main(java.lang.String[] args) throws twitter4j.TwitterException {
    searching.Finder f = new searching.Finder();
    bot.TwitterChecker bot = new bot.TwitterChecker();
    java.lang.System.out.println(f.wordRecommend("victry"));
    java.lang.System.out.println(bot.correctTweet("spellingsoldier"));
}