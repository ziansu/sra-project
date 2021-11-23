public java.lang.String getCPResourcePath(java.lang.String name) {
    if (!("/".equals(java.io.File.separator))) {
        return name.replaceAll(java.util.regex.Pattern.quote(java.io.File.separator), "/");
    }
    return name;
}