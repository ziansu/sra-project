public void increment() {
    executedLines.clear();
    controller.bot.BotVar var = getVariable(varNum);
    var.write(((var.read()) + (1 % (controller.Game.MAX_INT))));
}