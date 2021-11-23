protected redis.clients.jedis.Response<?> generateResponse(java.lang.Object data) {
    redis.clients.jedis.Response<?> response = pipelinedResponses.poll();
    if (response != null) {
        response.set(data);
    }
    return response;
}