@java.lang.Override
public void onSelect(com.sencha.gxt.widget.core.client.event.SelectEvent event) {
    log.setText((("running cmd: " + cmdString) + "  ..."));
    processingAnim(cmdString);
    gpfsService.runCmd(nodeop, nodes, new com.google.gwt.user.client.rpc.AsyncCallback<java.lang.String>() {
        @java.lang.Override
        public void onFailure(java.lang.Throwable caught) {
            log.setText(caught.getMessage());
            processingWait = false;
        }

        @java.lang.Override
        public void onSuccess(java.lang.String result) {
            log.setText(result);
            processingWait = false;
            reloadState();
        }
    });
}