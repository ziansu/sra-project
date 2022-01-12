@java.lang.Override
public void onResult(com.google.android.gms.common.api.Status result) {
    if (result.isSuccess()) {
        callback.onSuccess();
    }else {
        callback.onError(result.toString());
    }
}