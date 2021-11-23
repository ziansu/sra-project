private boolean isRetryable(com.google.rpc.Status status) {
    int codeId = status.getCode();
    io.grpc.Status.Code code = io.grpc.Status.fromCodeValue(codeId).getCode();
    return retryOptions.isRetryable(code);
}