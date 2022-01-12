public static void setMobileUserAgent(models.User user) {
    if (user.isLoggedIn()) {
        common.utils.UserAgentUtil userAgentUtil = new common.utils.UserAgentUtil(request());
        java.lang.String agentStr = userAgentUtil.getUserAgent();
        if (agentStr != null) {
            user.lastLoginUserAgent = userAgentUtil.getUserAgent().substring(0, java.lang.Math.min(100, agentStr.length()));
        }
    }
}