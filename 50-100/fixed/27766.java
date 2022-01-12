private boolean isEmpty(@org.jetbrains.annotations.NotNull
final java.util.Map<java.lang.String, java.lang.String> properties, @org.jetbrains.annotations.NotNull
final java.lang.String key) {
    if (jetbrains.buildServer.util.StringUtil.isEmptyOrSpaces(properties.get(key))) {
        return jetbrains.buildServer.util.StringUtil.isEmptyOrSpaces(properties.get(key.replace("github", "guthub")));
    }
    return false;
}