@java.lang.Override
public void success(com.twitter.sdk.android.core.Result<com.twitter.sdk.android.core.TwitterSession> result) {
    handleSuccess(result.data);
}