public void setMedia(java.io.File file) {
    try {
        mediaPlayer.setDataSource(context, android.net.Uri.fromFile(file));
        mediaPlayer.prepareAsync();
        timber.log.Timber.i("Preparing");
    } catch (java.io.IOException e) {
        timber.log.Timber.e(e);
    }
}