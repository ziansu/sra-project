public static mn.aug.restfulandroid.security.AuthorizationManager getInstance(mn.aug.restfulandroid.security.Context context) {
    if ((mn.aug.restfulandroid.security.AuthorizationManager.mInstance) == null) {
        mn.aug.restfulandroid.security.AuthorizationManager.mInstance = new mn.aug.restfulandroid.security.AuthorizationManager(context);
    }
    return mn.aug.restfulandroid.security.AuthorizationManager.mInstance;
}