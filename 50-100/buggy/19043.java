private void onLeaving() {
    ca.afroman.option.Options.instance().serverUsername = username.getText();
    ca.afroman.option.Options.instance().serverPassword = password.getText();
    ca.afroman.option.Options.instance().serverPort = port.getText();
    ca.afroman.option.Options.instance().serverIP = ca.afroman.game.Game.IPv4_LOCALHOST;
    ca.afroman.option.Options.instance().save();
}