@java.lang.Override
public io.hekate.messaging.internal.DefaultMessagingChannel<T> withAffinity(java.lang.Object affinityKey) {
    return new io.hekate.messaging.internal.DefaultMessagingChannel(gateway, cluster, balancer, failover, timeout, affinityKey);
}