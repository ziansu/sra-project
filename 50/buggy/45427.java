@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if ((this.onFocusChangeListener) != null) {
        this.onFocusChangeListener.onFocusChange(v, hasFocus);
    }
    focusChangedEvent(hasFocus);
}