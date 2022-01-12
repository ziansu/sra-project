public void stop() {
    timber.log.Timber.d("Stopping artoo link manager");
    stopVideoManager();
    super.stop();
}