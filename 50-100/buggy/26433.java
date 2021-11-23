private org.apache.hadoop.security.UserGroupInformation authenticatePolicyCreatorWithKerberos() {
    org.apache.hadoop.security.UserGroupInformation userGroupInformation = null;
    if (this.sentryConnection.getKerberosTicketConfiguration().isKerberosEnabled()) {
        com.thinkbiganalytics.kerberos.KerberosTicketGenerator ticket = new com.thinkbiganalytics.kerberos.KerberosTicketGenerator();
        try {
            userGroupInformation = ticket.generateKerberosTicket(this.sentryConnection.getKerberosTicketConfiguration());
            com.thinkbiganalytics.datalake.authorization.SentryAuthorizationService.log.info("Kerberos Authentication is successfull.");
            return userGroupInformation;
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(("Unable to authenticate with Kerberos while creating Sentry Policy  " + (e.getMessage())));
        }
    }
    return userGroupInformation;
}