@java.lang.Override
public void createPartControl(org.eclipse.swt.widgets.Composite parent) {
    fParentComposite = parent;
    if ((this) instanceof org.eclipse.tracecompass.tmf.ui.views.ITmfTimeAligned) {
        parent.addControlListener(new org.eclipse.swt.events.ControlListener() {
            @java.lang.Override
            public void controlResized(org.eclipse.swt.events.ControlEvent e) {
                realignViews();
            }

            @java.lang.Override
            public void controlMoved(org.eclipse.swt.events.ControlEvent e) {
            }
        });
        realignViews();
    }
}