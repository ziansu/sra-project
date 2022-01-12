private void handleCommand() {
    if (!(commandBar.getText().equals(""))) {
        con.executeCommand(commandBar.getText());
        commandHistory.add(0, commandBar.getText());
        commandBar.setText("");
    }
}