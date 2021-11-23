@java.lang.Override
public boolean matches(javax.servlet.http.HttpServletRequest arg0) {
    if ((arg0.getRequestURI().indexOf("/rest/")) > (-1)) {
        return false;
    }
    if ((arg0.getRequestURI().indexOf("/signin/mitreid")) > (-1)) {
        return false;
    }
    if (arg0.getMethod().equals("GET")) {
        return false;
    }
    return true;
}