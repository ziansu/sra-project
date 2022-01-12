@java.lang.Override
public void onClick(android.view.View v) {
    de.grau.organizer.classes.Action action = mEvent.getAction();
    if (action == null) {
        android.support.design.widget.Snackbar snackbar = null;
        snackbar = android.support.design.widget.Snackbar.make(v, "No Action set for this Event!", Snackbar.LENGTH_LONG);
        snackbar.show();
    }else {
        switch (action.getType()) {
            case de.grau.organizer.classes.Action.TYPE_CALL :
                call();
                break;
            default :
                android.support.design.widget.Snackbar snackbar = null;
                snackbar = android.support.design.widget.Snackbar.make(v, "Action found but not executable!", Snackbar.LENGTH_LONG);
                snackbar.show();
        }
    }
}