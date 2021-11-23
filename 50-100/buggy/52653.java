public void handle(javafx.event.ActionEvent arg0) {
    model.resetPlayerRoll();
    resetCardHandler();
    java.lang.System.out.println(getWürfel());
    disableCards();
    changeCardsToGewählt();
    if (checkGameContinue()) {
        server.sendObject(new message.ClientTurn(false));
    }else {
        if (!(profCard())) {
            server.sendObject(new message.GameFinished());
        }else {
            bewerteProfCard();
        }
    }
}