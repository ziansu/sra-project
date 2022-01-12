@java.lang.Override
public twitter4j.IDs getFollowersIDs(long arg0, long arg1, int arg2) throws twitter4j.TwitterException {
    if ((limits[2]) == 14) {
        SocialNetworkAnalysis.TwitterWrapper.timelimited[0] = new java.util.Date();
        limit.reached();
        limits[2] = 0;
    }
    java.lang.System.out.println("limits in getFollowersIDs: ");
    for (int limit : limits) {
        java.lang.System.out.print((limit + " "));
    }
    java.lang.System.out.println();
    (limits[2])++;
    return t.getFollowersIDs(arg0, arg1, arg2);
}