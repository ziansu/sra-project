@java.lang.Override
public java.lang.String getHost() {
    java.lang.String host = settings.getAdminHost();
    if (com.intellij.openapi.util.text.StringUtil.isEmpty(host)) {
        return "localhost";
    }
    return settings.getAdminHost();
}