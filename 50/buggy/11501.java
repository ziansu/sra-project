@java.lang.Override
public java.lang.String getAdminHost() {
    java.lang.String adminHost = settings.getAdminHost();
    if (com.intellij.openapi.util.text.StringUtil.isEmpty(adminHost)) {
        return "localhost";
    }
    return settings.getAdminHost();
}