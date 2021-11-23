@java.lang.Override
public boolean onKey(android.content.DialogInterface dialog, int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        if ((getFragmentManager()) != null) {
            getFragmentManager().popBackStack();
        }
    }
    return false;
}