@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public <C extends T> io.hekate.messaging.internal.DefaultMessagingChannel<C> withFailover(io.hekate.failover.FailoverPolicy policy) {
    return new io.hekate.messaging.internal.DefaultMessagingChannel(gateway, cluster, balancer, policy, timeout, affinityKey);
}