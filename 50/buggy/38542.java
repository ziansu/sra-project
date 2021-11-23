@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public <C extends T> io.hekate.messaging.MessagingChannel<C> withAffinity(java.lang.Object affinityKey) {
    return new io.hekate.messaging.internal.DefaultMessagingChannel(gateway, cluster, balancer, failover, timeout, affinityKey);
}