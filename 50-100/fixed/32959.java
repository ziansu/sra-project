@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    java.util.ArrayList<com.bmriv.android.streamify.ParcelableTrack> tracks = null;
    if (savedInstanceState != null) {
        tracks = savedInstanceState.getParcelableArrayList(com.bmriv.android.streamify.TopTracksActivityFragment.SAVE_TRACKS_KEY);
    }
    if (tracks == null)
        tracks = new java.util.ArrayList<>();
    
    mTrackAdapter = new com.bmriv.android.streamify.TrackAdapter(getActivity(), 0, tracks);
}