private java.lang.String generateContent() {
    if ((game) == null)
        return null;
    
    com.justdavis.karl.rpstourney.service.api.auth.Account authenticatedAccount = getAuthenticatedAccount();
    if (authenticatedAccount == null)
        return null;
    
    if (!(game.isPlayer(authenticatedAccount)))
        return null;
    
    java.lang.String content = com.justdavis.karl.rpstourney.webapp.jsp.PlayerNameTag.generateTag(messageSource, pageContext.getELContext().getLocale(), authenticatedAccount, game, game.determineOpponent(authenticatedAccount));
    return content;
}