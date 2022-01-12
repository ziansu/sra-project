public boolean addToken(java.lang.String userId, com.lqlsoftware.fuckchat.utils.TokenModel model) {
    setRedis();
    java.lang.String token = jedis.get(model.getUserId());
    if ((token != null) && (!(token.equals(model.getToken())))) {
        jedis.del(userId);
    }
    jedis.set(userId, model.getToken());
    jedis.expireAt(userId, sessionExpireTime);
    jedis.close();
}