@java.lang.Override
public void onEnable() {
    team.crazynetwork.raids.SkyBlockRaids.self = this;
    org.bukkit.Bukkit.getServer().getPluginManager().registerEvents(new team.crazynetwork.raids.skyfactory.Crook(), this);
    org.bukkit.Bukkit.addRecipe(team.crazynetwork.raids.skyfactory.Crook.recipe()[0]);
    org.bukkit.Bukkit.addRecipe(team.crazynetwork.raids.skyfactory.Crook.recipe()[1]);
}