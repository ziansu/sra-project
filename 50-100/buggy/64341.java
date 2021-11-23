@java.lang.Override
public boolean sendKeyEvent(android.view.KeyEvent event) {
    boolean shouldConsume = false;
    if ((event.getAction()) == (android.view.KeyEvent.ACTION_DOWN)) {
        switch (event.getKeyCode()) {
            case android.view.KeyEvent.KEYCODE_DEL :
                if ((getSelectionStart()) == 0) {
                    mListener.onBackFromCVV();
                    shouldConsume = true;
                }
                break;
            case android.view.KeyEvent.KEYCODE_ENTER :
                shouldConsume = true;
                mListener.onCVVEntryComplete();
                break;
        }
    }
    return shouldConsume ? true : super.sendKeyEvent(event);
}