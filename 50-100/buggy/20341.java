@java.lang.Override
public void reset() {
    for (org.eclipse.swt.widgets.TableItem item : features.getItems()) {
        item.dispose();
    }
    for (org.eclipse.swt.widgets.TableItem item : classes.getItems()) {
        item.dispose();
    }
    org.deidentifier.arx.gui.view.SWTUtil.disable(root);
}