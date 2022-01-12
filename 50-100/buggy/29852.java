@java.lang.Override
protected void onPostExecute(java.util.List<kaaes.spotify.webapi.android.models.Track> tracks) {
    if (tracks == null) {
        android.widget.Toast toast = android.widget.Toast.makeText(getActivity(), "Top tracks not found", Toast.LENGTH_SHORT);
        toast.show();
    }else {
        listView.setAdapter(mSpotifyAdapter);
        try {
            addTracks(tracks);
        } catch (java.net.MalformedURLException e) {
            e.printStackTrace();
        }
    }
}