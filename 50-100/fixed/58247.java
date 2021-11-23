public static java.lang.String getPort(final java.lang.String port, final java.lang.String enableTls) {
    if (("0".equals(port)) || (org.apache.commons.lang.StringUtils.isBlank(port))) {
        return org.apache.commons.lang.StringUtils.equals("yes", enableTls) ? "465" : "25";
    }else {
        return port;
    }
}