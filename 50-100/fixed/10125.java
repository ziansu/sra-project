public boolean checkToken(fundata.model.Token model) {
    if (model == null) {
        return false;
    }
    java.lang.String token = ((java.lang.String) (redisTemplate.boundValueOps(model.getUserId()).get()));
    if ((token == null) || (!(token.equals(model.getToken())))) {
        return false;
    }
    redisTemplate.boundValueOps(model.getUserId()).expire(Constants.TOKEN_EXPIRES_HOUR, java.util.concurrent.TimeUnit.HOURS);
    return true;
}