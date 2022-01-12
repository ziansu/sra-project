public nu.nerd.tpcontrol.User getUser(org.bukkit.entity.Player p) {
    nu.nerd.tpcontrol.User u = user_cache.get(p.getName().toLowerCase());
    if (u == null) {
        u = new nu.nerd.tpcontrol.User(this, p);
        user_cache.put(p.getName().toLowerCase(), u);
    }
    return u;
}