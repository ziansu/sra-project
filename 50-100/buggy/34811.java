private void build(java.lang.String fullMessage) {
    java.lang.String[] words = fullMessage.split(" ");
    command = this.findCommand(words[0]);
    arg = fullMessage.replaceFirst(command.getText(), "").trim();
}