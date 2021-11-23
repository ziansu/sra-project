public java.lang.String getShortName() {
    if ((name) != null) {
        java.util.regex.Matcher m = us.pojo.silentauction.model.User.SHORT_NAME_PATTERN.matcher(name);
        if (m.find()) {
            return m.group(1);
        }
    }
    return "";
}