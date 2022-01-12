@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState != null) {
        java.util.ArrayList<com.bmriv.android.streamify.ParcelableTrack> tracks = savedInstanceState.getParcelableArrayList(com.bmriv.android.streamify.TopTracksActivityFragment.SAVE_TRACKS_KEY);
        mTrackAdapter = new com.bmriv.android.streamify.TrackAdapter(getActivity(), 0, tracks);
    }else
        mTrackAdapter = new com.bmriv.android.streamify.TrackAdapter(getActivity(), 0, new java.util.ArrayList<com.bmriv.android.streamify.ParcelableTrack>());
    
}