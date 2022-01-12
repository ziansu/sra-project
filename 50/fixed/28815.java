public void done() {
    if (yourTurn) {
        yourTurn = false;
        sendMessage(GameMessage.END_TURN);
    }
}