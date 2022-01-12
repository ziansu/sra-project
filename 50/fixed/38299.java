public static boolean isLeader() throws java.lang.Exception {
    im.chic.weixin.utils.TokenCache.instance.initialize();
    return (null != (im.chic.weixin.utils.TokenCache.instance.leaderSelector)) && (im.chic.weixin.utils.TokenCache.instance.leaderSelector.hasLeadership());
}