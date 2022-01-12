@java.lang.Override
protected void onPostExecute(java.lang.Boolean sourceIsHLS) {
    prepareExoPLayer(sourceIsHLS, org.oucho.radio2.PlayerService.url);
    mExoPlayer.addListener(this);
}