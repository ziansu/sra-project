private void updateButtonStates() {
    ((android.widget.Button) (findViewById(R.id.startListeningButton))).setText((isListening ? R.string.stop_listening : R.string.start_listening));
    findViewById(R.id.clearConsoleButton).setEnabled(isListening);
    findViewById(R.id.sendMessageButton).setEnabled(isListening);
}