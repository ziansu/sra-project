@java.lang.Override
public java.util.List<java.lang.String> getOnlinePlayers() {
    java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    for (org.bukkit.entity.Player p : ((com.greatmancode.tools.interfaces.BukkitLoader) (getCaller().getLoader())).getServer().getOnlinePlayers()) {
        list.add(p.getName());
    }
    return list;
}