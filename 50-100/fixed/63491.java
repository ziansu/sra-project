private void initService() {
    if (com.trackertraced.trackerbee.application.views.TrackerBeeMapsActivity.serviceInitState) {
        android.content.Intent intentTrackerBeeService = new android.content.Intent(com.trackertraced.trackerbee.application.utils.ApplicationConstants.getContext(), com.trackertraced.trackerbee.application.service.TrackerBeeService.class);
        startService(intentTrackerBeeService);
        bindService(intentTrackerBeeService, com.trackertraced.trackerbee.application.utils.ApplicationConstants.getServiceMessengerManager().getServiceConnection(), Context.BIND_AUTO_CREATE);
        registerReceiver(locationListBroadCastReceiver, new android.content.IntentFilter(com.trackertraced.trackerbee.application.broadcastreceiver.ServiceBroadcastConstants.BROADCAST_LOCATION_LIST));
    }
}