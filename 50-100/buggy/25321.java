@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        v1.setVisibility(View.VISIBLE);
        v2.setVisibility(View.INVISIBLE);
        cam.release();
    }
    return super.onKeyDown(keyCode, event);
}