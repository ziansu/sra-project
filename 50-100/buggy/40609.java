@java.lang.Override
public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command cmd, java.lang.String label, java.lang.String[] args) {
    if (cmd.getName().equalsIgnoreCase("cosmetics")) {
        com.wolfie.cosmetics.gui.CosmeticsGUI.showCosmeticsGUI(((org.bukkit.entity.Player) (sender)));
        return true;
    }
    return false;
}