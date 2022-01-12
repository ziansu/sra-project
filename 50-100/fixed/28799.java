private void handleWinner(java.lang.String msg) {
    java.util.Scanner reader = new java.util.Scanner(msg);
    reader.next();
    int winner = java.lang.Integer.parseInt(reader.next());
    ui.displayWinner(getPlayer(winner));
    if (ui.newGame()) {
        controller.Controller.startClient();
    }else {
        shutdown();
    }
    reader.close();
}