@java.lang.Override
protected android.os.Parcelable onSaveInstanceState() {
    super.onSaveInstanceState();
    final android.os.Bundle outState = new android.os.Bundle();
    final int count = mMessages.size();
    final com.cocosw.undobar.UndoBarController.Message[] messages = new com.cocosw.undobar.UndoBarController.Message[count];
    mMessages.toArray(messages);
    outState.putParcelableArray(com.cocosw.undobar.UndoBarController.SAVED_STATE, messages);
    outState.putParcelable(com.cocosw.undobar.UndoBarController.STATE_CURRENT_MESSAGE, currentMessage);
    return outState;
}