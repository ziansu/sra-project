@java.lang.Override
public io.hekate.messaging.internal.DefaultMessagingChannel<T> withFailover(io.hekate.failover.FailoverPolicy policy) {
    return new io.hekate.messaging.internal.DefaultMessagingChannel(gateway, cluster, balancer, policy, timeout, affinityKey);
}