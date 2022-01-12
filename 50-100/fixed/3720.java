private java.lang.String createResetPasswordUrl(java.lang.Long userId, java.util.Locale locale) {
    java.lang.String temporaryToken = tokenCache.generateTemporaryToken(userId.toString(), ((10 * 60) * 1000));
    java.lang.String pageUrl = java.lang.String.format("%s/html/reset_password.html", baseUrl);
    return java.lang.String.format("%s?id=%s&token=%s&language=%s", pageUrl, userId, temporaryToken, locale.getLanguage());
}