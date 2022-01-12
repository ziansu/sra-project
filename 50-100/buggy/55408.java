public java.lang.String url() {
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    sb.append(((java.lang.String) (prp.get(com.example.prototype.applet.AppletConfig.CODEBASE))));
    java.lang.Object value = prp.get(com.example.prototype.applet.AppletConfig.ARCHIVE);
    if (value != null) {
        sb.append("/");
        sb.append(((java.lang.String) (value)));
    }
    return sb.toString();
}