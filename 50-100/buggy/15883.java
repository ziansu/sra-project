public void setRedisKeyNamespace(java.lang.String namespace) {
    if (com.gemstone.gemfire.internal.lang.StringUtils.isBlank(namespace)) {
        namespace = org.springframework.session.data.redis.RedisOperationsSessionRepository.DEFAULT_ATTR_SEPARATOR;
    }
    if (!(namespace.endsWith(org.springframework.session.data.redis.RedisOperationsSessionRepository.DEFAULT_ATTR_SEPARATOR))) {
        namespace = namespace.concat(org.springframework.session.data.redis.RedisOperationsSessionRepository.DEFAULT_ATTR_SEPARATOR);
    }
    this.namespace = namespace;
    computeKeyPrefix();
}