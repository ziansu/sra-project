@java.lang.Override
public boolean onKey(android.view.View v, int keyCode, android.view.KeyEvent event) {
    if ((keyCode == (android.view.KeyEvent.KEYCODE_ENTER)) && ((event.getAction()) == (android.view.KeyEvent.ACTION_UP))) {
        android.util.Log.d("###", "onKey: 按下确认键");
        jumpPage(v);
        return true;
    }
    return false;
}