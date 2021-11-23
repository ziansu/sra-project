@java.lang.Override
public void success(com.getirkit.irkit.net.IRInternetAPIService.PostMessagesResponse postMessagesResponse, retrofit.client.Response response) {
    if (callback != null) {
        callback.onSuccess();
    }
    consumeNextSendSignal();
}