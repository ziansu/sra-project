public void printWelcome(boolean dead) {
    java.lang.String toChange = "<html><body>";
    if (dead) {
        toChange += "<p style='font-size: 40px'>YOU DIED!</p>";
    }
    toChange += ((("<h1>welcome to THE MYSTICAL ADVENTURE</h1>" + "<p>") + (currentPlayer.getCurrentRoom().getNameAndDescription())) + "</p>") + "</html>";
    toChange = toChange.replaceAll("<p>", "<p style=font-size:13px>");
    frame.getPane().setText(toChange);
}