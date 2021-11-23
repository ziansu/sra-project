@java.lang.SuppressWarnings(value = "CloneDoesntCallSuperClone")
@java.lang.Override
public com.pcloud.networking.api.Call<T> clone() {
    return new com.pcloud.networking.api.ApiClientCall(apiComposer, rawCall.clone(), responseAdapter);
}