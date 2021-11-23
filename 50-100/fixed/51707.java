public boolean tokenCheck(org.bukkit.entity.Player p, int amount) {
    if (pl.dataBase.containsKey(p.getName())) {
        if ((pl.dataBase.get(p.getName())) >= amount) {
            return true;
        }else {
            return false;
        }
    }else {
        return false;
    }
}