private boolean isValidPatToken(org.xdi.oxauth.model.uma.wrapper.Token validatePatToken, long validatePatTokenExpiration) {
    final long now = java.lang.System.currentTimeMillis();
    if (((validatePatToken == null) || ((validatePatToken.getAccessToken()) == null)) || (validatePatTokenExpiration <= now)) {
        return false;
    }
    return true;
}