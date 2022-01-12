private void cacheSignInStatus(com.umasuo.developer.application.dto.DeveloperView developerView, java.lang.String token) {
    com.umasuo.developer.application.service.SignInApplication.LOGGER.debug("Enter.");
    java.lang.String key = java.lang.String.format(RedisKeyUtil.DEVELOPER_KEY_FORMAT, token);
    com.umasuo.developer.application.dto.DeveloperSession session = new com.umasuo.developer.application.dto.DeveloperSession(developerView, token);
    redisTemplate.boundHashOps(key).put(RedisKeyUtil.DEVELOPER_SESSION_KEY, session);
    redisTemplate.expire(key, com.umasuo.developer.application.service.SignInApplication.EXPIRE_TIME, java.util.concurrent.TimeUnit.MILLISECONDS);
    com.umasuo.developer.application.service.SignInApplication.LOGGER.debug("Exit.");
}