public java.util.List<de.fraunhofer.igd.klarschiff.service.security.Role> getGroupsByUserEmailAndGroupMatcher(java.lang.String email, java.lang.String groupMatchCondition) {
    de.fraunhofer.igd.klarschiff.service.security.User user = getUserByEmail(email);
    return securityServiceLdap.getObjectListFromLdap(groupSearchBase, (((((("(&(objectclass=" + (groupObjectClass)) + ")(") + groupMatchCondition) + ")(") + (org.apache.commons.lang.StringUtils.replace(groupSearchFilter, "{0}", user.getDn()))) + "))"), roleContextMapper);
}