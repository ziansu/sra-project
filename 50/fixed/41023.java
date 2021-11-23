@java.lang.Override
public void onClick(android.view.View v) {
    if (!(isActivated()))
        activate();
    
    setHasFocus(true);
    inputMethodManager.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT);
}