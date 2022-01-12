@java.lang.Override
public twitter4j.User showUser(java.lang.String arg0) throws twitter4j.TwitterException {
    if ((limits[1]) == 179) {
        SocialNetworkAnalysis.TwitterWrapper.timelimited[0] = new java.util.Date();
        limit.reached();
        limits[1] = 0;
    }
    (limits[1])++;
    java.lang.System.out.print("limits in showUser: ");
    for (int limit : limits) {
        java.lang.System.out.print((limit + " "));
    }
    java.lang.System.out.println();
    return t.showUser(arg0);
}