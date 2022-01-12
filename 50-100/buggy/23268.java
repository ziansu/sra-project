public boolean checkReadPermission(java.lang.String user, java.lang.String contextName, int securityLevel) {
    if (((user.equals(org.opends.server.snmp.SNMPUserAcl.ADMIN_USER)) && (contextName.equals("null"))) && (checkSecurityLevel(securityLevel))) {
        return true;
    }
    if (((checkReadPermission(user)) && (checkContextName(contextName))) && (checkSecurityLevel(securityLevel))) {
        return true;
    }
    return false;
}