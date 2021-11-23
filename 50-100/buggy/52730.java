public void broadcast(java.lang.String... target) {
    final java.lang.String end = (de.wolfi.minopoly.utils.Messages.Prefix) + (this.txt);
    for (int i = 0; i < (target.length); i++)
        end.replaceAll(("$" + i), target[i]);
    
    org.bukkit.Bukkit.broadcastMessage(end);
}