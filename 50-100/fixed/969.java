private void notifyCompletionListener() {
    if (!(muxNotifier.shouldNotifyCompletion(com.devbrackets.android.exomedia.EMListenerMux.COMPLETED_DURATION_LEEWAY))) {
        return ;
    }
    notifiedCompleted = true;
    delayedHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if ((completionListener) != null) {
                completionListener.onCompletion(null);
            }
            if ((bus) != null) {
                bus.post(new com.devbrackets.android.exomedia.event.EMMediaCompletionEvent());
            }
        }
    });
}