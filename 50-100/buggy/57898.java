private boolean auth(org.bukkit.command.CommandSender s, java.lang.String permission) {
    if ((!(s instanceof org.bukkit.entity.Player)) || (com.gabezter4.Vitals.Vitals.perms.playerHas(((org.bukkit.entity.Player) (s)), ("v." + permission))))
        return true;
    
    s.sendMessage("You don't have access to do that...");
    debug((((("player [" + (s.getName())) + "] denied permission [v.") + permission) + "]"));
    return false;
}