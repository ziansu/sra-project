@java.lang.Override
public void gotOneInstanceService(final com.smartOne.Services.BTService service) {
    updateAdapter(service);
    bcr = new android.content.BroadcastReceiver() {
        @java.lang.Override
        public void onReceive(android.content.Context arg0, android.content.Intent arg1) {
            if ((arg1.getAction()) == (com.smartOne.Services.BTService.ScanCompleteBroadcast)) {
                updateAdapter(service);
            }
        }
    };
    android.content.IntentFilter filter = new android.content.IntentFilter();
    filter.addAction(BTService.ScanCompleteBroadcast);
    this.getActivity().registerReceiver(bcr, filter);
}