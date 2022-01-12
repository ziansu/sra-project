@java.lang.Override
public void handleEvent(org.eclipse.swt.widgets.Event event) {
    final org.eclipse.swt.widgets.Button btn = ((org.eclipse.swt.widgets.Button) (event.widget));
    if ((btn.getData()) == (java.lang.Boolean.TRUE)) {
        if (btn.getSelection()) {
            if (!(btn.getGrayed())) {
                btn.setGrayed(true);
            }
        }else {
            if (btn.getGrayed()) {
                btn.setGrayed(false);
                btn.setSelection(true);
            }
        }
    }
}