public com.traintrax.navigation.service.position.TrainPositionEstimate getLastKnownTrainPosition(java.lang.String id) {
    java.lang.String requestUrl = com.traintrax.navigation.service.rest.client.RemoteTrainPositionService.createTrainPositionRequestUrl(hostName, port, id);
    com.traintrax.navigation.service.position.TrainPositionEstimate match = null;
    java.lang.String response = webServiceClient.sendRequest(requestUrl);
    com.traintrax.navigation.service.rest.data.TrainPositionUpdateMessage results = messageDeserializer.deserialize(response);
    match = convertToPositionUpdate(results);
    return match;
}