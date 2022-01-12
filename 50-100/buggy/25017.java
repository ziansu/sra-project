@java.lang.Override
public void setVisible(boolean visible) {
    super.setVisible(visible);
    if (visible && ((getSelectedTabItem()) == (registryTab))) {
        if ((cordovaPluginInfos) == null) {
            org.eclipse.swt.widgets.Display.getCurrent().asyncExec(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    populatePluginInfos();
                }
            });
        }
        org.eclipse.swt.widgets.Display.getCurrent().asyncExec(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                displayPluginInfos();
            }
        });
    }
}