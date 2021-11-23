public void sendString(java.lang.String s) {
    if ((null != s) && (!(android.text.TextUtils.isEmpty(s)))) {
        pubnubService.publishToPubnubChannel(s);
    }
}