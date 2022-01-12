public java.util.List<de.fraunhofer.igd.klarschiff.service.security.Role> getGroupsByUserEmailAndGroupMatcher(java.lang.String email, java.lang.String groupMatchCondition) {
    de.fraunhofer.igd.klarschiff.service.security.User user = getUserByEmail(email);
    if (user == null) {
        return new java.util.ArrayList<de.fraunhofer.igd.klarschiff.service.security.Role>();
    }
    return securityServiceLdap.getObjectListFromLdap(groupSearchBase, (((((("(&(objectclass=" + (groupObjectClass)) + ")(") + groupMatchCondition) + ")(") + (org.apache.commons.lang.StringUtils.replace(groupSearchFilter, "{0}", user.getDn()))) + "))"), roleContextMapper);
}