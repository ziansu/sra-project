public void updateStatus(int trackToPlay, int status, int position) {
    if (!(trackBeans.isEmpty())) {
        com.fritzbang.theplayer.TrackBean tmp = trackBeans.get(trackToPlay);
        tmp.status = status;
        tmp.position = position;
        trackBeans.set(trackToPlay, tmp);
        android.util.Log.d(com.fritzbang.theplayer.PlaylistArrayAdapter.DEBUG_TAG, ((("AdapterPosition: " + trackToPlay) + " ") + position));
        this.notifyDataSetChanged();
    }
}