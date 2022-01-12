private void reshard(final java.lang.String streamName) {
    com.datasift.connector.writer.DescribeStreamRequest streamInfoRequest = new com.datasift.connector.writer.DescribeStreamRequest().withStreamName(streamName);
    com.datasift.connector.writer.DescribeStreamResult streamInfoResult = client.describeStream(streamInfoRequest);
    java.util.List<com.datasift.connector.writer.Shard> shards = streamInfoResult.getStreamDescription().getShards();
    com.datasift.connector.writer.KinesisConsumerManager.log.info("Retrieving shard data for stream {}", streamName);
    if ((shards.size()) > 0) {
        partition = shards.get(0).getShardId();
    }else {
        throw new java.lang.RuntimeException(("No shards are available to consume data from for stream " + streamName));
    }
}