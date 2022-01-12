@java.lang.Override
public boolean enable(net.escapecraft.escapePlug.EscapePlug plugin) {
    listener = new de.hydrox.lockdown.LockdownListener(plugin);
    plugin.registerEvents(listener);
    plugin.registerCommands(this);
    return true;
}