@java.lang.Override
public void onPause() {
    super.onPause();
    player.setPlayWhenReady(false);
    if ((imaController) != null) {
        imaController.onPause();
    }
}