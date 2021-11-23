private void onlinePlayers(org.bukkit.entity.Player playerToExclude) {
    java.io.File outputFile = new java.io.File(getDataFolder(), "onlineplayers.txt");
    java.lang.String text = "";
    for (org.bukkit.entity.Player player : getServer().getOnlinePlayers())
        if (player != playerToExclude)
            text = (text + (player.getName())) + "\n";
        
    
    saveText(text, outputFile);
}