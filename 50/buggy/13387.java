private static redis.clients.jedis.Jedis getIstance() throws java.lang.Exception {
    if ((it.datatoknowledge.pbdmng.urlShortener.dao.jedis.DAOJedis.pool) == null) {
        try {
            it.datatoknowledge.pbdmng.urlShortener.dao.jedis.DAOJedis.pool = new redis.clients.jedis.JedisPool();
        } catch (java.lang.Exception e) {
            throw e;
        }
    }
    return it.datatoknowledge.pbdmng.urlShortener.dao.jedis.DAOJedis.pool.getResource();
}