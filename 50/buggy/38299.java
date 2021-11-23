public static boolean isLeader() throws java.lang.Exception {
    im.chic.weixin.utils.TokenCache.instance.initialize();
    return im.chic.weixin.utils.TokenCache.instance.leaderSelector.hasLeadership();
}