@java.lang.Override
public void onVisibilityChanged(boolean visible) {
    this.visible = visible;
    if (visible) {
        handler.post(drawRunner);
    }else {
        handler.removeCallbacks(drawRunner);
    }
}