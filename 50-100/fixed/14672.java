public com.traintrax.navigation.trackswitch.SwitchState getTrackSwitchState(java.lang.String id) {
    java.lang.String requestUrl = com.traintrax.navigation.service.rest.client.RemoteTrackSwitchService.createTrackSwitchStateRequestUrl(hostName, port, id);
    java.lang.String response = webServiceClient.sendRequest(requestUrl);
    com.traintrax.navigation.service.rest.data.TrackSwitchStateMessage results = messageDeserializer.deserialize(response);
    return com.traintrax.navigation.trackswitch.SwitchState.valueOf(results.getSwitchState());
}