public <T> com.applidium.graphqlient.call.QLResponse<T> send(com.applidium.graphqlient.QLRequest request) throws com.applidium.graphqlient.exceptions.QLException {
    com.applidium.graphqlient.call.QLCall<T> call = call(request);
    com.applidium.graphqlient.call.QLResponse<T> response = send(call);
    if ((response != null) && (response.isErrorResponse())) {
        throw new com.applidium.graphqlient.exceptions.QLException(response.getErrorsResponse().toString());
    }
    return send(call);
}