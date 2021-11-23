@java.lang.Override
public void deleteCall(java.lang.String endPoint, java.lang.String jsonData, news.caughtup.caughtup.ws.remote.Callback callback) {
    new news.caughtup.caughtup.ws.remote.RestClient.RequestTask(callback).execute(endPoint, "DELETE");
}