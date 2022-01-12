public static com.fitgoose.fitgoosedemo.utilities.YouTubeDialog newInstance(java.lang.String title, java.lang.String videoID) {
    com.fitgoose.fitgoosedemo.utilities.YouTubeDialog newDialog = new com.fitgoose.fitgoosedemo.utilities.YouTubeDialog();
    newDialog.videoID = videoID;
    com.fitgoose.fitgoosedemo.utilities.YouTubeDialog.title = title;
    return newDialog;
}