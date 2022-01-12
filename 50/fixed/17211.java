@java.lang.Override
public void notifyOnBuild(io.grpc.Server server) {
    this.server = com.google.common.base.Preconditions.checkNotNull(server);
}