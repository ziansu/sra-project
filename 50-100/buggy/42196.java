public static boolean isBotOwner(long id) {
    for (int i = 0; i < (io.ph.bot.Bot.getInstance().getConfig().getBotOwnerId());) {
        if ((io.ph.bot.Bot.getInstance().getConfig().getBotOwnerId()[i]) == id) {
            return true;
        }
    }
    return false;
}