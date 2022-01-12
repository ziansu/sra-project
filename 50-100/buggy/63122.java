public void registerCrafting() {
    if ((isEnabled()) && (module().getBoolean("enchanted-golden-apple-crafting"))) {
        if ((gvlfm78.plugin.OldCombatMechanics.utilities.Config.getConfig().getBoolean("old-golden-apples.no-conflict-mode")) && ((org.bukkit.Bukkit.getRecipesFor(napple).size()) > 0))
            return ;
        
        org.bukkit.Bukkit.addRecipe(r);
        gvlfm78.plugin.OldCombatMechanics.utilities.Messenger.debug("Added napple recipe");
    }
}