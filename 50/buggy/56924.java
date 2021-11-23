public static void setSubscriptions(java.util.ArrayList<java.lang.String> subs) {
    me.ccrama.redditslide.UserSubscriptions.subscriptions.edit().putString(Authentication.name, me.ccrama.redditslide.Reddit.arrayToString(subs)).apply();
}