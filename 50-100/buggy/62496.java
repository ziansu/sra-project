public boolean hasOwnership() {
    if (!(valid))
        return false;
    
    if ((cmd.getSelection().isOwner) || (cmd.getSender().hasPermission("shops.admin"))) {
        tbax.baxshops.Main.sendError(cmd.getSender(), Resources.NO_PERMISSION);
        return true;
    }else {
        return valid = false;
    }
}