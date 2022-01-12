public static io.grpc.LoadBalancer.PickResult withError(io.grpc.Status error) {
    com.google.common.base.Preconditions.checkArgument((!(error.isOk())), "error status shouldn't be OK");
    return new io.grpc.LoadBalancer.PickResult(null, null, error, false);
}