public static boolean isLocationSecured(java.lang.String location) throws javax.servlet.ServletException {
    for (java.lang.String securedLocation : org.eclipse.dirigible.runtime.security.SecuritySynchronizer.getSecuredLocations()) {
        if (location.startsWith(securedLocation)) {
            org.eclipse.dirigible.runtime.filter.SecuredLocationVerifier.logger.debug(java.lang.String.format("Location: %s is secured because of definition: %s", location, securedLocation));
            return true;
        }
    }
    org.eclipse.dirigible.runtime.filter.SecuredLocationVerifier.logger.debug(java.lang.String.format("Location: %s is NOT secured", location));
    return false;
}