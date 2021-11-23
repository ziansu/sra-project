@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        try {
            connectToPangu.setObjectView(com.example.aleksejs.pangumobileapp.GamePanel.object, 0);
            connectToPangu.stop();
        } catch (java.io.IOException ie) {
            ie.printStackTrace();
        }
        this.finish();
    }
    return super.onKeyDown(keyCode, event);
}