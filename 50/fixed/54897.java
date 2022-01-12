@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    if (callback != null) {
        callback.onFailure(error);
    }
}