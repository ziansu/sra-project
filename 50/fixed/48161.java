public void getVideos(java.lang.String playlistId) {
    android.widget.RelativeLayout activityLayout = ((android.widget.RelativeLayout) (findViewById(R.id.video_display_layout)));
    net.computingtutor.robert.computingtutor.PlaylistGetter videoPlaylistGetter = new net.computingtutor.robert.computingtutor.PlaylistGetter(this, videoList, playlistId, activityLayout);
    videoPlaylistGetter.GetPlaylist();
}