public void sendMessage(java.lang.String message) {
    this.writer.println(message);
    this.writer.flush();
    this.textField.setText("");
}