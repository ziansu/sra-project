public boolean checkWritePermission(java.lang.String user) {
    if (user.equals(org.opends.server.snmp.SNMPUserAcl.ADMIN_USER)) {
        return true;
    }
    return false;
}