private java.lang.String makeContextURLReady(java.lang.String context) {
    if ((context != null) && (!(context.equalsIgnoreCase("")))) {
        if (context.startsWith("/")) {
            return context;
        }else {
            return "/" + context;
        }
    }
    return "";
}