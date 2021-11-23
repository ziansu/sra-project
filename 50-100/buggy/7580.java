public void onAdminJoin(org.bukkit.entity.Player player, boolean fromEvent) {
    staff.add(player);
    if (fromEvent) {
        final java.util.ArrayList<java.lang.String> lines = latestToLines();
        if (lines != null)
            for (java.lang.String line : lines)
                player.sendMessage(ru.simsonic.rscMinecraftLibrary.Bukkit.GenericChatCodes.processStringStatic(((ru.simsonic.rscFirstJoinDemo.API.Settings.chatPrefix) + line)));
            
        
    }
}