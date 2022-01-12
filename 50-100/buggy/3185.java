public void onFreeze(org.bukkit.command.CommandSender sender, org.bukkit.entity.Player targetPlayer) {
    if (targetPlayer == null) {
        return ;
    }
    if (freezeHandler.isFrozen(targetPlayer.getUniqueId())) {
        freezeHandler.removeFreeze(sender, targetPlayer);
    }else
        freezeHandler.addFreeze(sender, targetPlayer);
    
}