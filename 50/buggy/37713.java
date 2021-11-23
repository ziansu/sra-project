@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((yy_current_view) != null) {
        yy_current_view.onResume();
    }
    if ((localAudioManager) != null) {
        changeShengDao(false);
    }
}