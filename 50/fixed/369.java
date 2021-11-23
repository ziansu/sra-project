@org.bukkit.event.EventHandler
public void OnChatMessage(org.bukkit.event.player.AsyncPlayerChatEvent e) {
    QueObjects.add(new US.bittiez.TotalTracker.QueObject(e.getPlayer().getUniqueId().toString(), SQLTABLE.PLAYER_CHAT, e.getPlayer().getName()));
    checkQue();
}