@com.erezbiox1.CommandsAPI.Command(name = "structure", arguments = "set center", permission = "structure.set.location.center")
public void setCenter(org.bukkit.entity.Player player, java.lang.String[] args) {
    for (com.pzg.www.movingstructure.main.objects.Structure structure : com.pzg.www.movingstructure.main.PluginMain.structures) {
        if (!(com.pzg.www.movingstructure.main.PluginMain.playerEditingStructure.isEmpty())) {
            if (com.pzg.www.movingstructure.main.PluginMain.playerEditingStructure.get(player).equalsIgnoreCase(structure.getName())) {
                structure.setCenter(player.getLocation());
            }
        }else
            player.sendMessage(((net.md_5.bungee.api.ChatColor.RED) + "You weren't creating a structure."));
        
    }
    com.pzg.www.movingstructure.main.PluginMain.playerEditingStructure.remove(player);
}