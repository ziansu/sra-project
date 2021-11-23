@java.lang.Override
public void onPause() {
    super.onPause();
    paused = true;
    handleMethods("pause");
    pause();
}