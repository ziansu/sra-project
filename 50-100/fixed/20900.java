@java.lang.Override
public void onSuccess(java.util.ArrayList<java.lang.String> result) {
    if (result == null)
        onFailure(null);
    else {
        setLoadscreenText("Done Loading !");
        int delay = destroyLoadscreen();
        list = result;
        com.google.gwt.user.client.Timer tableTimer = new com.google.gwt.user.client.Timer() {
            @java.lang.Override
            public void run() {
                showAllTitleElements();
                setupTable();
                setupRecommendedBuild();
                setupFooter();
            }
        };
        tableTimer.schedule(delay);
    }
}