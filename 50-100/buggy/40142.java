private boolean enableServices() {
    if (!(checkforGps())) {
        buildAlertMessageNoService(0);
    }
    if (checkforGps()) {
        if (!(isNetworkConnected())) {
            buildAlertMessageNoService(1);
        }
    }
    boolean isrequirementdone = checkforGps();
    isrequirementdone = isrequirementdone && (checkforGps());
    return isrequirementdone;
}