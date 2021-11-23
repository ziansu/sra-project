private transaction.Command findCommand(java.lang.String word) {
    for (java.lang.String command : transaction.Command.getEnums()) {
        if (stringEquals(word, command)) {
            return transaction.Command.valueOf(command);
        }
    }
    return transaction.Command.DEFAULT;
}