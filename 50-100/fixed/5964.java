@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (!hasFocus) {
        boolean isValid = validUser();
        ev_Role.setEnabled(isValid);
        if (isValid) {
            ev_Role.expandGroup(0);
        }else {
            ev_Role.collapseGroup(0);
        }
    }
}