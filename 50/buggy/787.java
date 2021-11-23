@java.lang.Override
public void onHomeButtonPressed() {
    homePressWatcher.stopWatch();
    manager.removeView(view);
}