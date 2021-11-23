public java.lang.String getHostname() {
    if (org.springframework.util.StringUtils.isEmpty(hostname)) {
        return "localhost";
    }
    return hostname;
}