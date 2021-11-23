@java.lang.Override
public void onSuccess(T result) {
    super.onSuccess(result);
    if ((onSuccess) != null) {
        onSuccess.invoke(result);
    }
    if ((onSuccessWithAsyncResult) != null) {
        onSuccessWithAsyncResult.invoke(result, com.github.kubatatami.judonetworking.builder.CallbackBuilder.LambdaCallback.getAsyncResult());
    }
    if ((onSuccessWithAsyncResult) != null) {
        onSuccessWithCacheInfo.invoke(result, com.github.kubatatami.judonetworking.builder.CallbackBuilder.LambdaCallback.getCacheInfo());
    }
}