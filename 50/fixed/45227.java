public static com.easemob.helpdeskdemo.utils.WelcomeMessageHandler getInstance(java.lang.String tenantId, java.lang.String imServiceUser) {
    com.easemob.helpdeskdemo.utils.WelcomeMessageHandler.instance = new com.easemob.helpdeskdemo.utils.WelcomeMessageHandler(tenantId, imServiceUser);
    return com.easemob.helpdeskdemo.utils.WelcomeMessageHandler.instance;
}