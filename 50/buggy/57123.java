public boolean checkWritePermission(java.lang.String user, java.lang.String contextName, int securityLevel) {
    if (((checkWritePermission(user)) && (contextName.equals("null"))) && (checkSecurityLevel(securityLevel))) {
        return true;
    }
    return false;
}