private void addList(java.lang.String id, java.util.List list) {
    if ((com.aerospike.redisson.RedissonClient.client) == null) {
        com.aerospike.redisson.RedissonClient.cacheDb.put(id, list);
        return ;
    }
    com.aerospike.client.Key key = new com.aerospike.client.Key("test", "cache", id);
    com.aerospike.client.Bin bin1 = new com.aerospike.client.Bin("list", list);
    com.aerospike.redisson.RedissonClient.client.put(null, key, bin1);
}