private boolean isEmpty(@org.jetbrains.annotations.NotNull
final java.util.Map<java.lang.String, java.lang.String> properties, @org.jetbrains.annotations.NotNull
final java.lang.String key) {
    java.lang.String value = jetbrains.buildServer.util.StringUtil.isEmptyOrSpaces(properties.get(key));
    if (!value) {
        key = key.replace("github", "guthub");
        value = jetbrains.buildServer.util.StringUtil.isEmptyOrSpaces(properties.get(key));
    }
    return value;
}