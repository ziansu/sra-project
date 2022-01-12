public void onPause() {
    manager.stop();
    paused = true;
    view.showPause();
}