protected static logic.command.Command extractHistory() {
    if (logic.command.Command.history.isEmpty()) {
        return null;
    }else {
        return logic.command.Command.history.pop();
    }
}