private void showTestMenu(long chatId) throws org.telegram.telegrambots.exceptions.TelegramApiException {
    java.util.ArrayList<java.lang.String> buttons = new java.util.ArrayList<java.lang.String>();
    buttons.add("/menu");
    buttons.add("/start");
    buttons.add("/showTestChart");
    buttons.add("/pieChart");
    org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup inlineKeyboard = Constructors.InlineKeyboardConstructor.getKeyboard(buttons);
    sendMessage(new Constructors.MessageConstructor().getSendMessage("this is *inline* menu message", chatId, "Markdown", inlineKeyboard));
}