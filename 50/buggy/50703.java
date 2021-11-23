@java.lang.Override
public void objectReceived(com.n9mtq4.console.lib.events.SentObjectEvent e, com.n9mtq4.console.lib.BaseConsole baseConsole) {
    if (e.getMessage().equalsIgnoreCase("launchertabpanel"))
        return ;
    
    if (!((e.getObject()) instanceof net.minecraft.launcher.ui.tabs.LauncherTabPanel))
        return ;
    
}