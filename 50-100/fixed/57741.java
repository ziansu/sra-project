public static java.lang.String generateAuthenticationHash(java.lang.String datetime, java.lang.String login, java.lang.String serverId) {
    java.lang.String secretkey = org.lamsfoundation.ld.integration.blackboard.LamsSecurityUtil.getServerKey();
    java.lang.String plaintext = (((datetime.toLowerCase().trim()) + (login.toLowerCase().trim())) + (serverId.toLowerCase().trim())) + (secretkey.toLowerCase().trim());
    java.lang.String hash = org.lamsfoundation.ld.integration.blackboard.LamsSecurityUtil.sha1(plaintext);
    return hash;
}