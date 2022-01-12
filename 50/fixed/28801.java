@java.lang.Override
public io.hekate.messaging.internal.DefaultMessagingChannel<T> withLoadBalancer(io.hekate.messaging.unicast.LoadBalancer<T> balancer) {
    return new io.hekate.messaging.internal.DefaultMessagingChannel(gateway, cluster, balancer, failover, timeout, affinityKey);
}