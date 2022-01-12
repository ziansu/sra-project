public static java.lang.String getDomain(java.lang.String domain) {
    java.lang.String[] splits = domain.split("\\.");
    if ((splits.length) >= 2) {
        domain = (("." + (splits[((splits.length) - 2)])) + ".") + (splits[((splits.length) - 1)]);
    }
    return domain;
}