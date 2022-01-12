@java.lang.Override
public boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
    android.util.Log.d(getClass().getSimpleName(), ("Key: " + i));
    switch (i) {
        case android.view.KeyEvent.KEYCODE_BACK :
            launchHomeScreen();
            finish();
            return true;
    }
    return true;
}