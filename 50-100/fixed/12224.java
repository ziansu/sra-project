@java.lang.Override
public void execute() {
    if (firstMessage) {
        models.NotificationCounter.incrementConversationsCount(recipient.id);
        email.SendgridEmailClient.getInstatnce().sendMailOnConversation(sender, recipient, message.conversation.post.title, message.body);
    }
    mobile.GcmSender.sendNewMessageNotification(recipient.id, sender.name, message.body);
}