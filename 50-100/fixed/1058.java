public static boolean isAuthenticatedUser(java.lang.String screenName) {
    java.lang.String[] authenticatedScreennames = jp.gr.java_conf.ya.yumura.Twitter.KeyManage.getScreenNames("", "");
    for (java.lang.String authenticatedScreenname : authenticatedScreennames) {
        if ((authenticatedScreenname.equals(screenName)) && (!(authenticatedScreenname.equals(""))))
            return true;
        
    }
    return false;
}