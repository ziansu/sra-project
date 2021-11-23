@java.lang.SuppressWarnings(value = "unchecked")
public void sendRequest(T object, java.lang.String requestType, retrofit2.Callback<okhttp3.ResponseBody> responseBodyCallback) {
    serverRequest = new com.sofac.fxmharmony.server.type.ServerRequest(requestType, object);
    serviceRetrofit.getData(logServerRequest(serverRequest)).enqueue(responseBodyCallback);
}