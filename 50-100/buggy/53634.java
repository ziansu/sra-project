@java.lang.Override
protected void onReceivingData() {
    podcasts = ((java.util.List) (receiveDataService.getData()));
    context.stopService(intentService);
    if (((podcasts) == null) || ((podcasts.size()) < (com.readyo.app.fragments.navigation.FragmentShowDetails.limit))) {
        thereIsMoreData = false;
    }
    updatePodcastsUI();
    requestSent = false;
    offset += 5;
}