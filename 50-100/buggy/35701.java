public static void addMessage(bot.Message msg) {
    if ((bot.Messages.index) < 100) {
        bot.Messages.messages[bot.Messages.index] = msg;
    }else {
        bot.Messages.printLog();
        bot.Messages.index = 0;
        bot.Messages.messages[bot.Messages.index] = msg;
    }
}