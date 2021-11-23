public boolean hasOwnership() {
    if (!(valid))
        return false;
    
    if ((cmd.getSelection().isOwner) || (cmd.getSender().hasPermission("shops.admin"))) {
        return true;
    }else {
        tbax.baxshops.Main.sendError(cmd.getSender(), Resources.NO_PERMISSION);
        return valid = false;
    }
}