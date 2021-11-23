@java.lang.SuppressWarnings(value = { "rawtypes" , "unchecked" })
public org.springframework.data.redis.connection.jedis.JedisConnectionFactory getConnectionFactoryForTest() {
    org.springframework.data.redis.connection.jedis.JedisConnectionFactory jcf = new org.springframework.data.redis.connection.jedis.JedisConnectionFactory();
    jcf.setPort(7379);
    jcf.afterPropertiesSet();
    org.springframework.data.redis.core.RedisTemplate rt = new org.springframework.data.redis.core.RedisTemplate<java.util.UUID, java.lang.Object>();
    rt.setConnectionFactory(jcf);
    rt.afterPropertiesSet();
    rt.execute(new org.springframework.data.redis.core.RedisCallback() {
        public java.lang.Object doInRedis(org.springframework.data.redis.connection.RedisConnection connection) throws org.springframework.dao.DataAccessException {
            connection.flushDb();
            return null;
        }
    });
    return jcf;
}