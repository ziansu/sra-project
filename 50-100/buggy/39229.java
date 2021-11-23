public static java.lang.String getContextPath(java.lang.String urlPath) {
    java.lang.String contextPath = "";
    java.lang.String path = urlPath;
    int index = path.indexOf("/services/soap");
    if ((index != (-1)) && (index != 0)) {
        contextPath = path.substring(0, index);
    }
    return contextPath;
}