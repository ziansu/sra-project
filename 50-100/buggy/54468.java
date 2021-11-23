@java.lang.Override
protected void onSetUpView() {
    java.lang.String messageStr = null;
    if ((message.direct()) == (EMMessage.Direct.SEND)) {
        messageStr = java.lang.String.format(context.getString(R.string.msg_recall_by_self));
        android.util.Log.e("textContent", messageStr);
    }else {
        messageStr = java.lang.String.format(context.getString(R.string.msg_recall_by_user), message.getUserName());
    }
    android.util.Log.e("textContent", (messageStr + (message.toString())));
    contentView.setText(messageStr);
}