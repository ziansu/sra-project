public redis.clients.jedis.Pipeline pipelined() {
    pipeline = new redis.clients.jedis.Pipeline();
    pipeline.setClient(client);
    return pipeline;
}