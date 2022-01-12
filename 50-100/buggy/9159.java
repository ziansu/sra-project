public static java.lang.String getRequestIP(javax.servlet.http.HttpServletRequest request) {
    java.lang.String ipAddr;
    ipAddr = request.getHeader("x-forwarded-for");
    if ((null == ipAddr) || ((ipAddr.length()) == 0)) {
        ipAddr = request.getHeader("X-Real-IP");
    }
    if ((null == ipAddr) || ((ipAddr.length()) == 0)) {
        ipAddr = "127.0.0.1";
    }
    return ipAddr;
}