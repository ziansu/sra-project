public void removeTribe(com.tealcube.minecraft.bukkit.tribes.data.Tribe tribe) {
    com.google.common.base.Preconditions.checkNotNull(tribe);
    tribeMap.remove(tribe.getUniqueId());
}