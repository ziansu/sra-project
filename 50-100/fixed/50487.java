@java.lang.Override
public void success(kaaes.spotify.webapi.android.models.Tracks tracks, retrofit.client.Response response) {
    if (((tracks != null) && ((tracks.tracks) != null)) && ((tracks.tracks.size()) > 0)) {
        parseData(tracks);
        isQueryRunning = false;
        getActivity().runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                updateUIAfterSearch();
            }
        });
    }else {
        isQueryRunning = false;
    }
}