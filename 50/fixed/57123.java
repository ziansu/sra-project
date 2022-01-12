public boolean checkWritePermission(java.lang.String user, java.lang.String contextName, int securityLevel) {
    return ((checkWritePermission(user)) && (contextName.equals("null"))) && (checkSecurityLevel(securityLevel));
}