public java.util.List<sk.tomsik68.helpplus.CommandInfo> getAllCommands() {
    return getDatabase().find(sk.tomsik68.helpplus.CommandInfo.class).orderBy("name").findList();
}