private transaction.Command findCommand(java.lang.String word) {
    for (transaction.Command command : transaction.Command.values()) {
        if (stringEquals(word, command.getText())) {
            return command;
        }
    }
    return transaction.Command.DEFAULT;
}