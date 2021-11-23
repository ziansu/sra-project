@java.lang.Override
public void onFailure(retrofit2.Call<me.maxdev.popularmoviesapp.api.DiscoverResponse<me.maxdev.popularmoviesapp.data.Movie>> call, java.lang.Throwable t) {
    sendUpdateFinishedBroadcast();
}