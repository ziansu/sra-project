public boolean checkReadPermission(java.lang.String user) {
    if ((user.equals(org.opends.server.snmp.SNMPUserAcl.DEFAULT_USER)) || (user.equals(org.opends.server.snmp.SNMPUserAcl.ADMIN_USER))) {
        return false;
    }
    return (this.usersList.contains(org.opends.server.snmp.SNMPUserAcl.ALL_USERS_ALLOWED)) || (this.usersList.contains(user));
}