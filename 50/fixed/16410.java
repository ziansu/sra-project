@java.lang.Override
public void initiateEntityPet() {
    super.initiateEntityPet();
    ((org.bukkit.entity.Tameable) (getBukkitEntity())).setOwner(org.bukkit.Bukkit.getOfflinePlayer(getPet().getOwnerUUID()));
}