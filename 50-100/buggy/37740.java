@java.lang.Override
public void success(kaaes.spotify.webapi.android.models.TracksPager tracksPager, retrofit.client.Response response) {
    kaaes.spotify.webapi.android.models.Pager<kaaes.spotify.webapi.android.models.Track> pager = tracksPager.tracks;
    if ((pager.items.size()) == 0) {
        android.util.Log.d(com.tbse.nano.nano_proj_1_spotify_streamer.activities.ListTracksActivity.TAG, "clearing list from searchSpotify");
        clearTrackResultsList();
        return ;
    }
    populateTrackResultsList(com.tbse.nano.nano_proj_1_spotify_streamer.models.MyTrack.listOfTrackToListOfMyTrack(pager.items));
}