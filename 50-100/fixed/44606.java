public void onEventMainThread(org.josejuansanchez.playground.model.Message message) {
    android.util.Log.d(org.josejuansanchez.playground.MainActivity.TAG, ("onEvent: " + (message.getType())));
    if ((message.getType()) == (Constants.UPDATE_MESSAGE)) {
        doUpdate(message);
    }else {
        doAction(message);
        mLastMessageExecuted = message;
    }
}