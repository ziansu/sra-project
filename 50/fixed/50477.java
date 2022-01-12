@java.lang.Override
public java.lang.String call() throws java.lang.Exception {
    java.lang.String uuid = hazelcastInstance.getCluster().getLocalMember().getUuid();
    com.hazelcast.samples.tricolor.MyCallable.log.info("call() runs on {}", uuid);
    return uuid;
}