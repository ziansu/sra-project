@java.lang.Override
public void run() {
    for (java.lang.String uuid : com.gamerking195.dev.thirst.listener.PlayerMoveListener.drinkingMap.keySet()) {
        java.util.UUID pid = java.util.UUID.fromString(uuid);
        org.bukkit.entity.Player p = org.bukkit.Bukkit.getPlayer(pid);
        if (p != null) {
            com.gamerking195.dev.thirst.Thirst.getThirst().setThirst(p, ((com.gamerking195.dev.thirst.Thirst.getThirst().getPlayerThirst(p)) + 2));
        }
    }
}