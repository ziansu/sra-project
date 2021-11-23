public static org.bukkit.inventory.ItemStack getGuiEnabled() {
    if ((io.github.apfelcreme.Pipes.PipesConfig.guiEnabled) == null) {
        io.github.apfelcreme.Pipes.PipesConfig.guiFiller = io.github.apfelcreme.Pipes.PipesConfig.getItemStack("gui.enabled");
    }
    return io.github.apfelcreme.Pipes.PipesConfig.guiEnabled;
}