@java.lang.Override
public void notifyStartTest(java.lang.String location, java.lang.String test) {
    org.eclipse.swt.widgets.Display.getDefault().asyncExec(new java.lang.Runnable() {
        public void run() {
            org.eclipse.commitplugin.actions.SampleAction action = new org.eclipse.commitplugin.actions.SampleAction();
            action.initialize();
        }
    });
}