private void tryToHandle(android.content.Intent intent) {
    android.util.Log.d(getClass().getName(), "Intent received");
    long convoId = intent.getLongExtra(sneer.android.ipc.SendMessage.TOKEN, (-1));
    final java.lang.String message = intent.getAction();
    sneer.android.SneerAndroidContainer.component(sneer.convos.Convos.class).getById(convoId).subscribe(new rx.functions.Action1<sneer.convos.Convo>() {
        @java.lang.Override
        public void call(sneer.convos.Convo convo) {
            sneer.android.SneerAndroidFlux.dispatch(convo.sendMessage(message));
        }
    });
}