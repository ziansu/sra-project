public void addTribe(com.tealcube.minecraft.bukkit.tribes.data.Tribe tribe) {
    com.google.common.base.Preconditions.checkNotNull(tribe);
    tribeMap.put(tribe.getUniqueId(), tribe);
}