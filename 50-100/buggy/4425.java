public static void updateExistingEmailMessage(com.sigmobile.dawebmail.database.User user, com.sigmobile.dawebmail.database.EmailMessage emailMessage, int contentID, java.lang.String fromName, java.lang.String fromAddress, java.lang.String subject, java.lang.String dateInMillis, java.lang.String readUnread, int totalAttachments, boolean important) {
    emailMessage.userName = user.username;
    emailMessage.contentID = contentID;
    emailMessage.fromName = fromName;
    emailMessage.fromAddress = fromAddress;
    emailMessage.subject = subject;
    emailMessage.dateInMillis = dateInMillis;
    emailMessage.readUnread = readUnread;
    emailMessage.totalAttachments = totalAttachments;
    emailMessage.important = important;
    emailMessage.save();
}