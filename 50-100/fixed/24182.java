@java.lang.Override
public void create(org.elasticsoftware.elasticactors.ShardKey shardKey, org.elasticsoftware.elasticactors.cluster.scheduler.ScheduledMessage scheduledMessage) {
    cassandraSession.execute(insertStatement.bind(clusterName, shardKey.toString(), scheduledMessage.getFireTime(java.util.concurrent.TimeUnit.MILLISECONDS), scheduledMessage.getId(), java.nio.ByteBuffer.wrap(org.elasticsoftware.elasticactors.serialization.internal.ScheduledMessageSerializer.get().serialize(scheduledMessage))));
}