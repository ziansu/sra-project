public void hookSendAudio(java.lang.String fileName, java.lang.String chatId, java.lang.Integer replyMessageId) {
    org.telegram.telegrambots.api.methods.send.SendVoice voice = new org.telegram.telegrambots.api.methods.send.SendVoice();
    try {
        org.springframework.core.io.Resource resource = new org.springframework.core.io.ClassPathResource(fileName);
        voice.setNewVoice(resource.getInputStream());
        voice.setChatId(chatId);
        if (replyMessageId != 0) {
            voice.setReplyToMessageId(replyMessageId);
        }
        org.telegram.telegrambots.api.objects.Message message = sendVoice(voice);
        com.loacg.kayo.handlers.DirectionsHandlers.logger.info(message.toString());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}