@java.lang.Override
public com.cidic.sdx.model.HPModel doInRedis(org.springframework.data.redis.connection.RedisConnection connection) throws org.springframework.dao.DataAccessException {
    org.springframework.data.redis.serializer.RedisSerializer<java.lang.String> ser = redisTemplate.getStringSerializer();
    byte[] bId = connection.hGet(ser.serialize("HpIDNum"), ser.serialize(hp_num));
    if (bId == null) {
        return null;
    }else {
        int id = java.lang.Integer.parseInt(ser.deserialize(bId));
        return getHPModelById(id, connection, ser);
    }
}