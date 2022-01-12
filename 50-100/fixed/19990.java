private boolean isValidPatToken(org.xdi.oxauth.model.uma.wrapper.Token validatePatToken, long validatePatTokenExpiration) {
    final long now = java.lang.System.currentTimeMillis();
    return !(((validatePatToken == null) || ((validatePatToken.getAccessToken()) == null)) || (validatePatTokenExpiration <= now));
}