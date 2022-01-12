public java.lang.String translate(java.lang.String from, java.lang.String targ, java.lang.String query) {
    java.util.Map<java.lang.String, java.lang.String> paramsMap = initParamsMap(from, targ, query);
    org.aming.http.HttpRequest httpRequest = new org.aming.http.HttpRequest();
    return org.aming.utils.StringUtils.trim(httpRequest.doGet((((org.aming.translate.impl.YoudaoDispatch.URL) + "&") + (org.aming.utils.StringUtils.toURLParams(paramsMap)))));
}