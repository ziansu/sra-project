public void collectData() {
    com.github.privacystreams.utils.Logging.debug("Collecting Data..");
    collectLogs();
    collectTextEntry();
    collectUIAction();
    collectNotifications();
    collectBrowserVisits();
    collectBrowserSearch();
    collectDeviceEvent();
    collectDeviceStates();
    collectLocation();
}