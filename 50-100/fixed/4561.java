public T get() {
    if (!(set)) {
        throw new redis.clients.jedis.exceptions.JedisDataException("Please close pipeline or multi block before calling this method.");
    }
    if (!(built)) {
        if ((data) != null) {
            if ((data) instanceof redis.clients.jedis.exceptions.JedisDataException) {
                throw new redis.clients.jedis.exceptions.JedisDataException(((redis.clients.jedis.exceptions.JedisDataException) (data)));
            }
            response = builder.build(data);
        }
        this.data = null;
        built = true;
    }
    return response;
}