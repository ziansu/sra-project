@java.lang.Override
public void onSoftKeyboardShown(boolean isShowing) {
    keyboardIsShowing = isShowing;
    if ((this.fragmentAddField) != null)
        this.fragmentAddField.keyboardShowing = isShowing;
    
}