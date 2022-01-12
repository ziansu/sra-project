@java.lang.Override
public void onClick(android.view.View v) {
    de.grau.organizer.classes.Action action = mEvent.getAction();
    android.support.design.widget.Snackbar snackbar = null;
    if (action == null) {
        snackbar = android.support.design.widget.Snackbar.make(v, "No Action set for this Event!", Snackbar.LENGTH_LONG);
    }else {
        switch (action.getType()) {
            case de.grau.organizer.classes.Action.TYPE_CALL :
                call();
                break;
            default :
                snackbar = android.support.design.widget.Snackbar.make(v, "Action found but not executable!", Snackbar.LENGTH_LONG);
        }
    }
    snackbar.show();
}