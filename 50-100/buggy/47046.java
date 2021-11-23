protected void onSave() {
    service.execute(createSaveCommand(), view.getSavingMonitor(), new com.google.gwt.user.client.rpc.AsyncCallback() {
        @java.lang.Override
        public void onFailure(java.lang.Throwable caught) {
        }

        @java.lang.Override
        public void onSuccess(java.lang.Object result) {
            getStore().commitChanges();
            onSaved();
        }
    });
}