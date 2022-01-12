@java.lang.Override
public void onResponse(com.sun.jna.Pointer userData, net.maidsafe.binding.model.FfiResult.ByVal result, com.sun.jna.Pointer data, long dataLen) {
    removeFromPool(this);
    if (result.isError()) {
        future.completeExceptionally(new java.lang.Exception(result));
        return ;
    }
    future.complete(java.util.Arrays.asList(data.getStringArray(0, ((int) (dataLen)))));
}