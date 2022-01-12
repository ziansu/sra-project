private void showContactChatInAdapter() {
    if (com.wwwsmschat.smschat.util.Validator.isObjectValid(mContact)) {
        if (com.wwwsmschat.smschat.util.Validator.isObjectValid(mContact.getChat())) {
            for (com.wwwsmschat.smschat.model.Message message : mContact.getChat().getMessages()) {
                com.wwwsmschat.smschat.util.Logger.d(com.wwwsmschat.smschat.activity.ChatActivity.TAG, ("message length " + (message.getBody().length())));
            }
            updateMessagesAdapter(mContact.getChat().getMessages());
        }else {
            com.wwwsmschat.smschat.util.ViewUtil.showView(mNoDataView);
        }
    }
}