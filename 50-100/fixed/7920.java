@javax.annotation.Nullable
@java.lang.Override
public io.grpc.NameResolver newNameResolver(java.net.URI targetUri, io.grpc.Attributes params) {
    final io.grpc.NameResolver resolver = delegate.newNameResolver(targetUri, params);
    if (resolver == null) {
        return null;
    }
    return new io.grpc.NameResolver() {
        @java.lang.Override
        public java.lang.String getServiceAuthority() {
            return authorityOverride;
        }

        @java.lang.Override
        public void start(io.grpc.internal.Listener listener) {
            resolver.start(listener);
        }

        @java.lang.Override
        public void shutdown() {
            resolver.shutdown();
        }
    };
}