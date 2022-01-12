protected void fetchData() {
    mEventBus.post(new com.jbirdvegas.mgerrit.message.StartingRequest(intent, mQueueId));
    T data = retreiveFromCache(intent);
    if (data == null) {
        try {
            com.urswolfer.gerrit.client.rest.GerritRestApi gerritApi = getGerritApiInstance(true);
            onResponse(getData(gerritApi));
        } catch (com.google.gerrit.extensions.restapi.RestApiException e) {
            handleRestApiException(e);
        }
    }else {
        onResponse(data);
    }
}