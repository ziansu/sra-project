private void sendRequest(io.datakernel.http.HttpClientConnection connection, io.datakernel.http.HttpRequest request, long timeoutTime, io.datakernel.http.ResultCallback<io.datakernel.http.HttpResponse> callback) {
    connection.send(request, timeoutTime, callback);
}