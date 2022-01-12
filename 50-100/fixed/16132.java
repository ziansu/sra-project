@java.lang.Override
public void stateChanged(org.springframework.ide.eclipse.boot.dash.model.BootDashElement e) {
    org.eclipse.swt.widgets.Display display = getPart().getSite().getShell().getDisplay();
    if (display == null) {
        display = org.eclipse.swt.widgets.Display.getDefault();
    }
    if (display != null) {
        display.asyncExec(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                refresh();
            }
        });
    }else {
        refresh();
    }
}