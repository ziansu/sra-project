@java.lang.Override
public void setPetDisplayName(java.lang.String name) {
    if (name == null)
        return ;
    
    if ((com.github.shynixn.petblocks.bukkit.logic.business.configuration.ConfigPet.getInstance().getPetNameBlackList()) != null) {
        for (final java.lang.String blackName : com.github.shynixn.petblocks.bukkit.logic.business.configuration.ConfigPet.getInstance().getPetNameBlackList()) {
            if (name.toUpperCase().contains(blackName.toUpperCase())) {
                throw new java.lang.RuntimeException("Name is not valid!");
            }
        }
    }
    this.petDisplayName = org.bukkit.ChatColor.translateAlternateColorCodes('&', name);
}