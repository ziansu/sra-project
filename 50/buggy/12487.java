@java.lang.Override
protected java.lang.Boolean getFallback() {
    net.whydah.sso.commands.adminapi.user.CommandUserExists.log.warn("CommandUserExists - fallback - uri={}", userAdminServiceUri.toString());
    return null;
}