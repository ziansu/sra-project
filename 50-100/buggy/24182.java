@java.lang.Override
public void create(org.elasticsoftware.elasticactors.ShardKey shardKey, org.elasticsoftware.elasticactors.cluster.scheduler.ScheduledMessage scheduledMessage) {
    com.datastax.driver.core.PreparedStatement insertStatement = cassandraSession.prepare("INSERT INTO ScheduledMessages (key, key2, column1, column2, value) VALUES (?, ?, ?, ?, ?)");
    java.util.UUID id = scheduledMessage.getId();
    final org.elasticsoftware.elasticactors.cassandra2.cluster.scheduler.UUID timeUuid = new org.elasticsoftware.elasticactors.cassandra2.cluster.scheduler.UUID(id.getMostSignificantBits(), id.getLeastSignificantBits());
    cassandraSession.execute(insertStatement.bind(clusterName, shardKey.toString(), scheduledMessage.getFireTime(java.util.concurrent.TimeUnit.MILLISECONDS), timeUuid, java.nio.ByteBuffer.wrap(org.elasticsoftware.elasticactors.serialization.internal.ScheduledMessageSerializer.get().serialize(scheduledMessage))));
}