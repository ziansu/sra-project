public void collectData() {
    com.github.privacystreams.utils.Logging.debug("Collecting Data..");
    collectLogs();
    collectDeviceStates();
    collectLocation();
    collectTextEntry();
    collectUIAction();
    collectNotifications();
    collectBrowserVisits();
    collectBrowserSearch();
    collectDeviceEvent();
}