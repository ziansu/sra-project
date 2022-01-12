public void displayYoutubeUploads() {
    net.computingtutor.robert.computingtutor.YoutubeApi youtubeApiKey = new net.computingtutor.robert.computingtutor.YoutubeApi();
    java.lang.String youtubeUploads = youtubeApiKey.getUploadPlaylistId();
    android.widget.RelativeLayout activityLayout = ((android.widget.RelativeLayout) (findViewById(R.id.main_activity_layout)));
    net.computingtutor.robert.computingtutor.PlaylistGetter UploadsPlaylistGetter = new net.computingtutor.robert.computingtutor.PlaylistGetter(this, lv, youtubeUploads, activityLayout);
    UploadsPlaylistGetter.GetPlaylist();
}