public void sendCommand(android.view.View view) {
    android.widget.EditText input = ((android.widget.EditText) (findViewById(R.id.input)));
    java.lang.String command = input.getText().toString();
    de.paulkunze.piui.GuiUpdater.updateConsoleWithCommand(command);
    de.paulkunze.piui.ConsoleActivity.client.publish(UserData.topicOut, command);
    input.setText("");
}