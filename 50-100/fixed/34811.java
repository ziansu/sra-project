private void build(java.lang.String fullMessage) {
    java.lang.String[] words = fullMessage.split(" ");
    command = this.findCommand(words[0].trim());
    arg = fullMessage.replaceFirst(command.getText(), "").trim();
}