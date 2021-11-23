@java.lang.Override
public void onPause() {
    super.onPause();
    tearDownVideoControlsHandler();
    if (!(isChangingConfigurations())) {
        pause();
    }
    if (isFinishing()) {
        tearDownVideoPlayback();
    }
}