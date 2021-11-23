public boolean isHistoryCommand() {
    return (!(text.equals("clear"))) && (!(text.trim().isEmpty()));
}