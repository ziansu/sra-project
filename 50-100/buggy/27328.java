private void handleCommand() {
    if ((commandBar.getText()) != null) {
        con.executeCommand(commandBar.getText());
        commandHistory.add(0, commandBar.getText());
        commandBar.setText("");
    }
}