private void pause() {
    locker = false;
    com.remote.noctis.remotecontrol.ClientActivity.running = false;
    stopThread(t);
    stopThread(connection);
    stopThread(touchConnection);
    stopThread(keyConnection);
    this.finish();
}