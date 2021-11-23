@java.lang.Override
public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command cmd, java.lang.String label, java.lang.String[] args) {
    if (((args.length) > 0) && (args[0].equalsIgnoreCase("list"))) {
        net.kronosville.oneb.pvp.PvP.listPlayers(sender);
        net.kronosville.oneb.OneB.sendMsg(sender, "NOTICE: Please just use the player (tab) list next time; the names of players who have PvP on will show up in red.");
    }else
        if (sender instanceof org.bukkit.entity.Player) {
            net.kronosville.oneb.pvp.PvP.togglePvPState(((org.bukkit.entity.Player) (sender)));
        }else {
            net.kronosville.oneb.OneB.sendPlayerOnlyMsg(sender);
        }
    
    return true;
}