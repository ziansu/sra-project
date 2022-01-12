@java.lang.Override
public void sendMessage(org.bukkit.entity.Player player, net.md_5.bungee.api.chat.BaseComponent... components) {
    for (net.md_5.bungee.api.chat.BaseComponent comp : components) {
        sendMessage(player, comp);
    }
}