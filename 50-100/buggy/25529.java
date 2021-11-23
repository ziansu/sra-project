public boolean hasPerm(org.bukkit.command.CommandSender sender) {
    boolean hasPerm = false;
    if (!(perm.equals(""))) {
        for (java.lang.String perm : this.perm.split("\\|")) {
            if (sender.hasPermission(perm)) {
                hasPerm = true;
            }
            if (sender.hasPermission(("-" + perm))) {
                return false;
            }
        }
    }else {
        hasPerm = true;
    }
    return hasPerm;
}