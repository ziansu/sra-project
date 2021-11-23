@java.lang.Override
protected void initiateBackground() {
    try {
        com.timsu.astrid.C2DMReceiver.register();
        java.lang.String authToken = actFmPreferenceService.getToken();
        invoker = new com.todoroo.astrid.actfm.sync.ActFmInvoker(authToken);
        if (authToken != null) {
            performSync();
        }
    } catch (java.lang.IllegalStateException e) {
    } catch (java.lang.Exception e) {
        handleException("actfm-authenticate", e, false);
    } finally {
        actFmPreferenceService.stopOngoing();
    }
}