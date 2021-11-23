public com.google.cloud.bigtable.config.CallOptionsConfig.Builder setShortRpcTimeoutMs(int shortRpcTimeoutMs) {
    com.google.common.base.Preconditions.checkArgument((shortRpcTimeoutMs > 0), "Short Timeout ms has to be greater than 0.");
    this.shortRpcTimeoutMs = shortRpcTimeoutMs;
    return this;
}