@java.lang.Override
public com.xiaomi.linden.thrift.common.LindenResult search(final com.xiaomi.linden.thrift.common.LindenSearchRequest request) throws java.io.IOException {
    if ((cache) != null) {
        try {
            com.xiaomi.linden.thrift.common.LindenResult result = cache.get(request);
            if (!(result.isSuccess())) {
                cache.invalidate(request);
            }
            return result;
        } catch (java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(com.google.common.base.Throwables.getStackTraceAsString(e));
        }
    }
    return coreSearch(request);
}