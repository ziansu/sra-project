@java.lang.Override
public void onResponse(com.sun.jna.Pointer userData, net.maidsafe.binding.model.FfiResult.ByVal result, int reqId, java.lang.String uri) {
    removeFromPool(this);
    if (result.isError()) {
        future.completeExceptionally(new java.lang.Exception(result));
    }
    future.complete(new net.maidsafe.binding.model.AuthUriResponse(reqId, uri));
}