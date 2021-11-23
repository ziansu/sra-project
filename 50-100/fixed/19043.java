private void onLeaving() {
    ca.afroman.option.Options.instance().serverUsername = username.getText();
    ca.afroman.option.Options.instance().serverPassword = password.getText();
    ca.afroman.option.Options.instance().serverPort = port.getText();
    ca.afroman.option.Options.instance().save();
}