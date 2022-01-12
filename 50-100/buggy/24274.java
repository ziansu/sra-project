@java.lang.Override
public void delRelationshipByKey(java.lang.String key) {
    if (!(singleSignOn)) {
        throw new com.scienjus.authorization.exception.MethodNotSupportException("非单点登录时无法调用该方法");
    }
    java.lang.String token = getToken(key);
    redis.delete(formatKey(key));
    redis.delete(formatToken(token));
}