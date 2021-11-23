private void setWebhook(java.lang.String botToken) throws org.telegram.telegrambots.TelegramApiException {
    if (botToken != null) {
        throw new org.telegram.telegrambots.TelegramApiException("Parameter botToken can not be null");
    }
    org.telegram.telegrambots.TelegramBotsApi.setWebhook(extrenalUrl, botToken, pathToCertificate, publicCertificateName);
}