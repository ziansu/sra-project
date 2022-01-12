private void displayTestCollection(final com.google.gwt.user.client.ui.Panel testsPanel) {
    currentActorOption.loadTests(new com.google.gwt.user.client.rpc.AsyncCallback<java.util.List<gov.nist.toolkit.results.client.TestInstance>>() {
        @java.lang.Override
        public void onFailure(java.lang.Throwable throwable) {
            new gov.nist.toolkit.xdstools2.client.widgets.PopupMessage(("getTestlogListing: " + (throwable.getMessage())));
        }

        @java.lang.Override
        public void onSuccess(java.util.List<gov.nist.toolkit.results.client.TestInstance> testInstances) {
            loadingMessage.setHTML("Loading...");
            displayTests(testsPanel, testInstances, allowRun());
        }
    });
}