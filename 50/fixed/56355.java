@java.lang.Override
public void onReadyStateChange(com.byteshaft.requests.HttpRequest request, int readyState) {
    switch (readyState) {
        case com.byteshaft.requests.HttpRequest.STATE_DONE :
            switch (request.getStatus()) {
                case java.net.HttpURLConnection.HTTP_NO_CONTENT :
                    break;
            }
    }
}