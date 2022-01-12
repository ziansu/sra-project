public java.lang.String createToken(java.lang.String userId) {
    com.umasuo.device.center.application.service.TokenApplication.LOG.debug("Enter. userId: {}.", userId);
    java.lang.String token = ((java.lang.String) (redisTemplate.opsForValue().get(userId)));
    if (org.apache.commons.lang3.StringUtils.isBlank(token)) {
        token = org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric(com.umasuo.device.center.application.service.TokenApplication.TOKEN_LENGTH);
        java.lang.String key = (com.umasuo.device.center.application.service.TokenApplication.USER_DEVICE_TOKEN_PREFIX) + userId;
        redisTemplate.opsForValue().set(key, token, com.umasuo.device.center.application.service.TokenApplication.EXPIRE_TIME, com.umasuo.device.center.application.service.TokenApplication.TIME_UTIL);
    }
    com.umasuo.device.center.application.service.TokenApplication.LOG.debug("Exit. token: {}.", token);
    return token;
}