public boolean checkReadPermission(java.lang.String user) {
    if (user.equals(org.opends.server.snmp.SNMPUserAcl.DEFAULT_USER)) {
        return false;
    }
    if (user.equals(org.opends.server.snmp.SNMPUserAcl.ADMIN_USER)) {
        return false;
    }
    if ((this.usersList.contains(org.opends.server.snmp.SNMPUserAcl.ALL_USERS_ALLOWED)) || (this.usersList.contains(user))) {
        return true;
    }
    return false;
}