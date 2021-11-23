@java.lang.Override
public void sendMessage(org.bukkit.entity.Player player, net.md_5.bungee.api.chat.BaseComponent... components) {
    try {
        net.pl3x.bukkit.chatapi.ComponentSender.sendMessage(player, components);
    } catch (java.lang.Exception e) {
        for (net.md_5.bungee.api.chat.BaseComponent comp : components) {
            sendMessage(player, comp);
        }
    }
}