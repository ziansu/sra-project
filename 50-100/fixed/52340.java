@org.junit.Test
public void eachNode() {
    for (java.lang.String key : nodes.keySet()) {
        com.gqshao.redis.cluster.Jedis jedis = null;
        try {
            jedis = nodes.get(key).getResource();
            jedis.ping();
        } catch (java.lang.Exception e) {
            java.lang.System.out.println((("节点[" + key) + "]异常"));
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }
}