@java.lang.Override
public synchronized void run() {
    final org.bukkit.command.ConsoleCommandSender console = plugin.getServer().getConsoleSender();
    for (java.lang.String line : lines)
        if (line != null)
            console.sendMessage(ru.simsonic.rscMinecraftLibrary.Bukkit.GenericChatCodes.processStringStatic(((ru.simsonic.rscFirstJoinDemo.API.Settings.chatPrefix) + line)));
        
    
    for (org.bukkit.entity.Player online : staff)
        for (java.lang.String line : lines)
            if (line != null)
                online.sendMessage(ru.simsonic.rscMinecraftLibrary.Bukkit.GenericChatCodes.processStringStatic(((ru.simsonic.rscFirstJoinDemo.API.Settings.chatPrefix) + line)));
            
        
    
    notify();
}