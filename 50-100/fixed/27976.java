@java.lang.Override
public void onVideoSizeChanged(final android.media.MediaPlayer mp, final int width, final int height) {
    int index = java.util.Arrays.binarySearch(mediaPlayers, mp);
    videoSizeCalculators[index].setVideoSize(mp.getVideoWidth(), mp.getVideoHeight());
    if ((mRenderer) != null) {
        mRenderer.setVideoSize(index, width, height);
    }
    if (videoSizeCalculators[index].hasASizeYet()) {
        requestLayout();
    }
}