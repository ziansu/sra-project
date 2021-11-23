@java.lang.Override
public void execute() {
    models.NotificationCounter.incrementConversationsCount(recipient.id);
    if (firstMessage) {
        email.SendgridEmailClient.getInstatnce().sendMailOnConversation(sender, recipient, message.conversation.post.title, message.body);
    }
    mobile.GcmSender.sendNewMessageNotification(recipient.id, sender.name, message.body);
}