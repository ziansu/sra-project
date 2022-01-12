@java.lang.Override
public void run() {
    if ((msg) >= (msgAmount))
        msg = 0;
    
    if ((msgAmount) != 0) {
        if (eCheck.hasTM)
            new io.puharesource.mc.titlemanager.api.ActionbarTitleObject(((org.bukkit.ChatColor.GREEN) + (messages.get(msg)))).broadcast();
        else
            org.bukkit.Bukkit.dispatchCommand(org.bukkit.Bukkit.getConsoleSender(), ("say " + (messages.get(msg))));
        
        (msg)++;
    }
}