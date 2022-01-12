public boolean has(org.bukkit.command.CommandSender me, java.lang.String perm, boolean informSenderIfNot) {
    if (has(me, perm)) {
        return true;
    }else
        if (informSenderIfNot && (me != null)) {
            me.sendMessage(this.getForbiddenMessage(perm));
        }
    
    return false;
}