public void setSwitchState(java.lang.String id, com.traintrax.navigation.trackswitch.SwitchState switchState) throws java.io.IOException {
    java.lang.String requestUrl = com.traintrax.navigation.service.rest.client.RemoteTrackSwitchService.createTrackSwitchStateRequestUrl(hostName, port, id);
    com.traintrax.navigation.service.rest.data.TrackSwitchStateMessage trackSwitchStateMessage = new com.traintrax.navigation.service.rest.data.TrackSwitchStateMessage(id, switchState.toString());
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String message = gson.toJson(trackSwitchStateMessage);
    webServiceClient.post(requestUrl, message);
}