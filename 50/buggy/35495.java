private static void sendEmail(java.lang.String[] params) {
    util.EmailSender.get().sendEmail(EmailType.Dafault, "Default text");
}