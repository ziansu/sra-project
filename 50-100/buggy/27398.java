@java.lang.Override
public com.youtube.vitess.proto.Vtgate.CommitResponse commit(com.youtube.vitess.client.Context ctx, com.youtube.vitess.proto.Vtgate.CommitRequest request) throws com.youtube.vitess.client.VitessException, com.youtube.vitess.client.VitessRpcException {
    try (com.youtube.vitess.client.grpc.GrpcContext gctx = new com.youtube.vitess.client.grpc.GrpcContext(ctx)) {
        return blockingStub.commit(request);
    } catch (java.lang.Exception e) {
        checkGrpcError(e);
        throw new com.youtube.vitess.client.VitessRpcException("grpc error", e);
    }
}