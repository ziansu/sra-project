public static java.lang.String getRealIP(javax.servlet.http.HttpServletRequest request) {
    java.lang.String ip = request.getHeader("X-Real-IP");
    if (org.apache.commons.lang3.StringUtils.isNotBlank("ip")) {
        return ip;
    }else {
        java.lang.String remoteAddr = request.getRemoteAddr();
        if (org.apache.commons.lang3.StringUtils.isNotBlank(remoteAddr)) {
            return remoteAddr;
        }
    }
    return "";
}