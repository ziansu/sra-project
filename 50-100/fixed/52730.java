public void broadcast(java.lang.String... target) {
    final java.lang.String end = (de.wolfi.minopoly.utils.Messages.Prefix) + (this.txt);
    java.lang.StringBuilder tmp = new java.lang.StringBuilder();
    for (int i = 0; i < (target.length); i++)
        tmp.append(end.replaceAll(("$" + i), target[i]));
    
    org.bukkit.Bukkit.broadcastMessage(tmp.toString());
}