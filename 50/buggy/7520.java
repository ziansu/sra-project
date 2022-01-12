@java.lang.Override
public void sendMessage(org.bukkit.entity.Player player, net.md_5.bungee.api.chat.BaseComponent component) {
    try {
        net.pl3x.bukkit.chatapi.ComponentSender.sendMessage(player, component);
    } catch (java.lang.Exception e) {
        player.sendMessage(component.toPlainText());
    }
}