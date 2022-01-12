private static boolean shouldSend(java.util.Optional<java.time.LocalDateTime> emailSentOpt, int timeToWait) {
    if (emailSentOpt.isPresent()) {
        long lastEmailSent = emailSentOpt.get().atZone(java.time.ZoneId.systemDefault()).toInstant().getEpochSecond();
        long now = java.time.LocalDateTime.now().atZone(java.time.ZoneId.systemDefault()).toInstant().getEpochSecond();
        return timeToWait < (now - lastEmailSent);
    }
    return true;
}