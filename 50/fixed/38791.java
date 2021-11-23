public boolean hasEnough(org.bukkit.entity.Player p, int magicka) {
    if ((me.dbizzzle.SkyrimRPG.SpellManager.magicka.get(p)) >= magicka)
        return true;
    else
        return false;
    
}