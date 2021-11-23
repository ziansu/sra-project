public void addTribe(com.tealcube.minecraft.bukkit.tribes.data.Tribe tribe) {
    com.google.common.base.Preconditions.checkNotNull(tribe);
    com.google.common.base.Preconditions.checkState((!(tribeMap.containsKey(tribe.getUniqueId()))));
    tribeMap.put(tribe.getUniqueId(), tribe);
}