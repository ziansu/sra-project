private static void sendEmail() {
    util.EmailSender.get().sendEmail(EmailType.Dafault, "Default text");
}