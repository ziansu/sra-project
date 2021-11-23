@java.lang.Override
public void onResponse(final retrofit2.Call<com.charlesmadere.hummingbird.models.Feed> call, final retrofit2.Response<com.charlesmadere.hummingbird.models.Feed> response) {
    final com.charlesmadere.hummingbird.models.Feed body = (response.isSuccessful()) ? response.body() : null;
    if (body == null) {
        listener.failure(com.charlesmadere.hummingbird.networking.Api.retrieveErrorInfo(response));
    }else {
        com.charlesmadere.hummingbird.networking.Api.hydrateFeed(body, null, listener);
    }
}