public static io.grpc.LoadBalancer.PickResult withSubchannel(io.grpc.LoadBalancer.Subchannel subchannel, @javax.annotation.Nullable
io.grpc.ClientStreamTracer.Factory streamTracerFactory) {
    return new io.grpc.LoadBalancer.PickResult(com.google.common.base.Preconditions.checkNotNull(subchannel, "subchannel"), streamTracerFactory, Status.OK, false);
}