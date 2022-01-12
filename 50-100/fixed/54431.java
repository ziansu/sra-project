private void showContactChatInAdapter() {
    if (com.wwwsmschat.smschat.util.Validator.isObjectValid(mContact)) {
        if (com.wwwsmschat.smschat.util.Validator.isObjectValid(mContact.getChat())) {
            updateMessagesAdapter(mContact.getChat().getMessages());
        }else {
            com.wwwsmschat.smschat.util.ViewUtil.showView(mNoDataView);
        }
    }
}