public void setBuddyMessage(nu.yona.server.analysis.entities.ActivityCommentMessage message) {
    buddyMessage = message;
    message.setSenderCopyMessage(this);
}