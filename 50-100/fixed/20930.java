@java.lang.Override
public void onResponse(com.sun.jna.Pointer userData, net.maidsafe.binding.model.FfiResult.ByVal result, long handleOne, long handleTwo) {
    removeFromPool(this);
    if (result.isError()) {
        future.completeExceptionally(new java.lang.Exception(result));
        return ;
    }
    future.complete(java.util.Arrays.asList(handleOne, handleTwo));
}