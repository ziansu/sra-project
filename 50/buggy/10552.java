public com.google.cloud.bigtable.config.CallOptionsConfig.Builder setShortRpcTimeoutMs(int shortRpcTimeoutMs) {
    com.google.common.base.Preconditions.checkArgument((shortRpcTimeoutMs > 0), "Short Timeout ms has to be greater than 0.");
    com.google.common.base.Preconditions.checkArgument((shortRpcTimeoutMs < 300000), "Short Timeout ms has to be less than 300,000.");
    this.shortRpcTimeoutMs = shortRpcTimeoutMs;
    return this;
}