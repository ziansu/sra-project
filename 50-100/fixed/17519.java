public void startPlay() {
    if (com.ml.yx.comm.StringUtil.isNotBlank(currentUri)) {
        videoView.setVideoURI(android.net.Uri.parse(currentUri));
        videoView.start();
        if ((videoPlayListener) != null) {
            videoPlayListener.onPlayStart();
        }
    }
}