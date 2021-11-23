public static java.lang.String prependWebContextRoot(java.lang.String postfixUrl) {
    java.lang.String webContext = org.wso2.carbon.utils.CarbonUtils.getServerConfiguration().getFirstProperty("WebContextRoot");
    if ((webContext != null) && (!(webContext.equals("/")))) {
        postfixUrl = webContext + postfixUrl;
    }
    return postfixUrl;
}