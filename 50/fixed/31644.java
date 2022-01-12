public static void setAppClient(javax.servlet.http.HttpServletRequest request) {
    java.lang.String appClient = request.getParameter("_appclient");
    if (appClient != null) {
        org.shaolin.bmdp.runtime.security.UserContext.andriodAppDevice.set(true);
    }else {
        org.shaolin.bmdp.runtime.security.UserContext.andriodAppDevice.set(null);
    }
}