public void reload() {
    userServiceAsync.reloadNotifications(new org.iabako.client.tools.IabakoAsyncCallback<java.lang.Void>() {
        @java.lang.Override
        public void onFailure(java.lang.Throwable caught) {
        }

        public void onSuccess(java.lang.Void result) {
            super.onSuccess(result);
            load();
        }
    });
}