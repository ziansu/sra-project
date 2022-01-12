@java.lang.SuppressWarnings(value = "unchecked")
public void sendRequest(T object, java.lang.String requestType, retrofit2.Callback<okhttp3.ResponseBody> responseBodyCallback) {
    serverRequest = new com.sofac.fxmharmony.server.type.ServerRequest(requestType, object);
    logServerRequest(serverRequest);
    serviceRetrofit.getData(serverRequest).enqueue(responseBodyCallback);
}