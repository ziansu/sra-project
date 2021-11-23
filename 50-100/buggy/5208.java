@org.springframework.scheduling.annotation.Scheduled(fixedDelay = 7200000)
public void clearInvalidatedToken() {
    com.brewery.services.auth.token.job.ClearInvalidatedToken.LOGGER.info("Invalidate tokens Database cleaning started");
    java.util.List<com.brewery.admin.auth.InvalidToken> invalidTokens = adminUserDao.getInvalidatedTokens();
    for (com.brewery.admin.auth.InvalidToken invalidToken : invalidTokens) {
        java.lang.String token = invalidToken.getToken();
        if (tokenService.isTokenExpired(token)) {
            adminUserDao.removeInvalidatedToken(invalidToken);
        }
    }
}