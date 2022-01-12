public void clearPublicChatMessages(java.lang.String meetingID, java.lang.String requesterID) {
    org.bigbluebutton.red5.pubsub.ClearPublicChatHistoryRequestMessage msg = new org.bigbluebutton.red5.pubsub.ClearPublicChatHistoryRequestMessage(meetingID, requesterID);
    sender.send(MessagingConstants.TO_CHAT_CHANNEL, msg.toJson());
}