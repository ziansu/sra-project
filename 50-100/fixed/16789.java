private void tryToHandle(android.content.Intent intent) {
    android.util.Log.d(getClass().getName(), "Intent received");
    long convoId = intent.getLongExtra(sneer.android.ipc.SendMessage.TOKEN, (-1));
    java.lang.String message = intent.getAction();
    sneer.android.SneerAndroidFlux.dispatch(sneer.convos.Convo.sendMessage(convoId, message));
}