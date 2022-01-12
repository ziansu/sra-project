@java.lang.Override
public void onResponse(retrofit2.Call<com.onehilltech.backbone.http.Resource> call, retrofit2.Response<com.onehilltech.backbone.http.Resource> response) {
    if (response.isSuccessful()) {
        int count = response.body().get("count");
        completionCallback.done(count);
    }else {
        completionCallback.fail(new java.lang.IllegalStateException("Failed to get count"));
    }
}