public static int printPlayerPrompt(int player, model.desk desk) {
    view.Tui.logger.info("");
    view.Tui.logger.info((("Spieler " + player) + ": Bitte geben Sie eine Spalte an: "));
    while (0 != (desk.setDeskToken(handleInput.getInput(desk), player))) {
        view.Tui.logger.info("Bitte geben sie eine g�ltige Spalte an!");
    } 
    view.Tui.logger.info("");
    return controller.switchPlayer(player);
}