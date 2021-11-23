public int getCommandsCount() {
    int i = getDatabase().find(sk.tomsik68.helpplus.CommandInfo.class).findRowCount();
    return i;
}