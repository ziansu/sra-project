public void sendString(java.lang.String s) {
    if (!(android.text.TextUtils.isEmpty(s))) {
        pubnubService.publishToPubnubChannel(s);
    }
}