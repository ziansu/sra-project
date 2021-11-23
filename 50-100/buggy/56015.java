public void addPlayer(org.bukkit.entity.Player player) {
    playerList.add(player);
    for (org.bukkit.entity.Player x : playerList) {
        x.sendMessage((((((org.bukkit.ChatColor.GOLD) + "Player: ") + (player.getDisplayName())) + (org.bukkit.ChatColor.GOLD)) + " has joined the game on your team!"));
    }
    player.setGameMode(GameMode.SURVIVAL);
    me.untilt.Objects.Kit kit = new me.untilt.Objects.Kit();
    kit.giveKit(player);
}