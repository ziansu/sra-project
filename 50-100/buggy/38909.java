@java.lang.Override
public java.util.List<java.lang.String> getOnlinePlayers() {
    java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    org.bukkit.entity.Player[] pList = ((com.greatmancode.tools.interfaces.BukkitLoader) (getCaller().getLoader())).getServer().getOnlinePlayers();
    for (org.bukkit.entity.Player p : pList) {
        list.add(p.getName());
    }
    return list;
}