@java.lang.Override
public boolean onEnable() {
    if ((game) == null)
        return false;
    
    plugin.getServer().getPluginManager().registerEvents(this, plugin);
    if ((changes) == null)
        changes = new java.util.LinkedHashMap<>();
    else
        changes.clear();
    
    finished = false;
    return true;
}