public boolean executeChatCommand(java.lang.String cmd, java.lang.String arg, java.lang.String channel) {
    if (!(this.state))
        return false;
    
    if (this.chatCommands.containsKey(cmd.toLowerCase())) {
        return ((boolean) (this.chatCommands.get(cmd.toLowerCase()).call(this.context, this.scope, this.scope, new java.lang.Object[]{ cmd , arg , channel })));
    }
    return false;
}