private boolean isValid(final java.lang.String value) {
    if (com.google.common.base.Strings.isNullOrEmpty(value)) {
        return false;
    }
    if (value.contains("|")) {
        return false;
    }
    if (!(org.sonatype.nexus.httpclient.config.NonProxyHostsValidator.NON_PROXY_HOST_PATTERN.matcher(value).matches())) {
        return false;
    }
    return true;
}