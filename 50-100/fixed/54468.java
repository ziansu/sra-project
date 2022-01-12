@java.lang.Override
protected void onSetUpView() {
    java.lang.String messageStr = null;
    if ((message.direct()) == (EMMessage.Direct.SEND)) {
        messageStr = java.lang.String.format(context.getString(R.string.msg_recall_by_self));
    }else {
        messageStr = java.lang.String.format(context.getString(R.string.msg_recall_by_user), message.getUserName());
    }
    contentView.setText(messageStr);
}