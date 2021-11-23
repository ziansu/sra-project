public org.bukkit.Sound getBukkit(org.bitbucket.ucchy.cr.SoundEnum def) {
    if (org.bitbucket.ucchy.cr.Utility.isCB19orLater())
        return getSound(v18name, def.getBukkit());
    
    return getSound(v19name, def.getBukkit());
}