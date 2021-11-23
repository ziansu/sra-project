@java.lang.Override
public com.orangefunction.tomcat.redissessions.RedisSession deserializeInto(byte[] data, com.orangefunction.tomcat.redissessions.RedisSession session) throws java.io.IOException, java.lang.ClassNotFoundException {
    com.esotericsoftware.kryo.Kryo kryo = pool.borrow();
    com.esotericsoftware.kryo.io.Input input = new com.esotericsoftware.kryo.io.Input(data);
    com.orangefunction.tomcat.redissessions.RedisSession redisSession = kryo.readObject(input, com.orangefunction.tomcat.redissessions.RedisSession.class);
    redisSession.setManager(session.getManager());
    pool.release(kryo);
    return redisSession;
}