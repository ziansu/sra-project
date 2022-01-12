@java.lang.Override
public java.lang.String login() {
    logger.info(("Login request sent in name of " + (username)));
    try {
        java.util.Collection<java.lang.String> response = internalLoginProcess();
        if (response.contains(org.mondo.collaboration.online.core.StorageAccessSvn.ERROR_SVN_LOGIN)) {
            logger.error(("-> Response: " + (org.mondo.collaboration.online.core.StorageAccessSvn.ERROR_SVN_LOGIN)));
            return org.mondo.collaboration.online.core.StorageAccessSvn.ERROR_SVN_LOGIN;
        }
    } catch (java.lang.Exception e) {
        logger.error("-> Response: Internal error during login", e);
    }
    logger.error("-> Response: OK");
    return null;
}