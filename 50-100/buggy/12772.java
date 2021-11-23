@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    int temp = ((sharedPreferences.getInt(Constants.CURRENT_PLAYING_VIDEO_NUMBER, (-1))) + 1) % (videoList.size());
    vvVideo.setVideoURI(videoList.get(temp));
    com.example.saksham.overlayscreenshort.PlaylistAdapter.changeActiveItemBackground(sharedPreferences.getInt(Constants.CURRENT_PLAYING_VIDEO_NUMBER, (-1)), temp);
    editor.putInt(Constants.CURRENT_PLAYING_VIDEO_NUMBER, temp);
    editor.commit();
    vvVideo.start();
}