@java.lang.Override
public com.bqreaders.lib.token.TokenGrant createToken(com.bqreaders.lib.token.TokenInfo info, long expiresIn, java.lang.String... tags) {
    java.time.Instant expireTime = clock.instant().plus(expiresIn, java.time.temporal.ChronoUnit.SECONDS);
    long expiresAt = expireTime.toEpochMilli();
    java.lang.String token = serializer.serialize(info, expiresAt, signer);
    if (info.isOneUseToken()) {
        oneTimeAccessTokenRepository.save(new com.bqreaders.lib.token.model.OneTimeAccessToken(token, java.util.Date.from(expireTime), tags));
    }
    return new com.bqreaders.lib.token.TokenGrant(token, expiresIn);
}