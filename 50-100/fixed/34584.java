public void translate(java.lang.String text) {
    android.util.Log.d(yandex.muratov.translator.network.NetworkUIConnector.TAG, java.lang.String.format("translate: %s", text));
    if ((text == null) || (text.trim().equals(""))) {
        sendEmptyAnswer();
        dropLastRequest();
        return ;
    }
    dropLastRequest();
    translateRequest(text);
}