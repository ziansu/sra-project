public void addVipTweet(util.VipTweet vipTweet) {
    if (!(isTweetInDb(vipTweet.getIdStr(), "vipTweets"))) {
        addVipTweetData(vipTweet);
        if ((vipTweet.getGeneratedId()) != 0) {
            addVipTweetMentions(vipTweet);
        }else {
            try {
                throw new java.lang.Exception("VIP Tweet database Insert returned 0");
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }else {
        java.lang.System.out.println((("VipTweet " + (vipTweet.getIdStr())) + " is already in DB"));
    }
}