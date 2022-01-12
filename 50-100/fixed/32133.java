private void initDragDrop() {
    org.eclipse.kura.web.client.util.DropSupport drop = org.eclipse.kura.web.client.util.DropSupport.addIfSupported(this.composer);
    if (drop != null) {
        drop.setListener(new org.eclipse.kura.web.client.util.DropSupport.Listener() {
            @java.lang.Override
            public boolean onDrop(org.eclipse.kura.web.client.util.DropSupport.DropEvent event) {
                java.lang.String factoryPid = getFactoryPidFromDropUrl(event.getAsText());
                if (factoryPid != null) {
                    org.eclipse.kura.web.client.ui.wires.WiresPanelUi.showComponentCreationDialog(factoryPid);
                }
                return true;
            }

            @java.lang.Override
            public boolean onDragOver(org.eclipse.kura.web.client.util.DropSupport.DropEvent event) {
                return true;
            }
        });
    }
}