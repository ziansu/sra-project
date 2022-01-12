@java.lang.Override
public void onReadyStateChange(com.byteshaft.requests.HttpRequest httpRequest, int i) {
    switch (i) {
        case com.byteshaft.requests.HttpRequest.STATE_DONE :
            switch (httpRequest.getStatus()) {
                case java.net.HttpURLConnection.HTTP_OK :
                    finish();
                    if ((com.byteshaft.medicosperuanos.messages.MainMessages.getInstance()) != null) {
                        com.byteshaft.medicosperuanos.messages.MainMessages.getInstance().getMessages();
                    }
                    break;
            }
    }
}