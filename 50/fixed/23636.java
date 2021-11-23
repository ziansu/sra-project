public void setBuddyMessage(nu.yona.server.analysis.entities.ActivityCommentMessage message) {
    buddyMessage = message;
    if (message == null) {
        return ;
    }
    message.setSenderCopyMessage(this);
}