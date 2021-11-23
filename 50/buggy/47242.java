@java.lang.Override
public void onResponse(com.sun.jna.Pointer userData, net.maidsafe.binding.model.FfiResult.ByVal result, com.sun.jna.Pointer pointer) {
    removeFromPool(this);
    if (result.isError()) {
        future.completeExceptionally(new java.lang.Exception(result));
    }
    future.complete(pointer);
}