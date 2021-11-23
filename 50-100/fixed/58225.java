@java.lang.Override
public void onInput(org.bukkit.entity.Player player, java.lang.Number value) {
    java.lang.String entity = event.getInventory().getTitle().split(" ")[1];
    com.Ben12345rocks.AdvancedMobControl.Config.ConfigEntity.getInstance().setExp(entity, 0, value.intValue());
    player.sendMessage("Value set");
    plugin.reload();
}