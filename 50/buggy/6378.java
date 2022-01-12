@java.lang.Override
public java.lang.Integer getAdminPort() {
    java.lang.Integer adminPort = settings.getAdminPort();
    if (adminPort == null) {
        return 8000;
    }
    return settings.getAdminPort();
}