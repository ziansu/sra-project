public static void sendMessage(com.google.api.services.gmail.model.Message message) throws java.io.IOException, javax.mail.MessagingException {
    if ((android.g38.ritik.Gmail.ScheduleMail.mService) != null)
        android.g38.ritik.Gmail.ScheduleMail.mService.users().messages().send("me", message).execute();
    
}