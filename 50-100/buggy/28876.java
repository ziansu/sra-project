public boolean isSessionStorageEnabled(org.apache.shiro.subject.Subject subject) {
    boolean enabled = false;
    if (org.apache.shiro.web.util.WebUtils.isWeb(subject)) {
        javax.servlet.http.HttpServletRequest request = org.apache.shiro.web.util.WebUtils.getHttpRequest(subject);
        if (request.getHeader("accept").equals(null)) {
            enabled = true;
        }else
            if ((request.getHeader("accept").indexOf("application/json")) < 0) {
                enabled = true;
            }else {
                enabled = false;
            }
        
    }else {
        return enabled;
    }
    return enabled;
}