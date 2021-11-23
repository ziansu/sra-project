com.orangefunction.tomcat.redissessions.RedisSession deserializeInto(byte[] data) throws java.io.IOException, java.lang.ClassNotFoundException {
    com.esotericsoftware.kryo.Kryo kryo = pool.borrow();
    com.esotericsoftware.kryo.io.Input input = new com.esotericsoftware.kryo.io.Input(data);
    com.orangefunction.tomcat.redissessions.RedisSession redisSession = kryo.readObject(input, com.orangefunction.tomcat.redissessions.RedisSession.class);
    pool.release(kryo);
    return redisSession;
}