private void refresh() {
    if (org.fossasia.openevent.utils.NetworkUtils.haveNetworkConnection(getActivity())) {
        org.fossasia.openevent.dbutils.DataDownloadManager.getInstance().downloadTracks();
        setVisibility(true);
    }else {
        org.fossasia.openevent.OpenEventApp.getEventBus().post(new org.fossasia.openevent.events.TracksDownloadEvent(false));
        setVisibility(false);
    }
}