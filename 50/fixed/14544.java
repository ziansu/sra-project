@java.lang.Override
void onFailure(org.mozilla.gecko.sync.net.MozResponse response) {
    if ((response.getStatusCode()) == 400) {
        delegate.onBadRequest(response);
    }else {
        delegate.onFailure(response);
    }
}