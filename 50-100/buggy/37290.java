public void stopSender() {
    android.util.Log.d(cl.smartcities.isci.transportinspector.detectionService.StateLocationSender.TAG, "stopSender");
    sendAllLocations();
    cl.smartcities.isci.transportinspector.serverConnection.requests.pushRequests.PurgeTokenRequest purgeTokenRequest = new cl.smartcities.isci.transportinspector.serverConnection.requests.pushRequests.PurgeTokenRequest(this.token);
    cl.smartcities.isci.transportinspector.serverConnection.ServerConnectionController.sendRequest(purgeTokenRequest, new cl.smartcities.isci.transportinspector.serverConnection.ServerResponseListener<java.lang.String>() {
        @java.lang.Override
        public void callback(java.lang.String response) {
        }

        @java.lang.Override
        public java.lang.String getToken() {
            return cl.smartcities.isci.transportinspector.detectionService.StateLocationSender.TAG;
        }
    });
    timer.cancel();
}