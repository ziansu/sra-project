private void addChestIfValid(org.bukkit.util.Vector chestLocation) {
    try {
        fr.zcraft.zbanque.structure.containers.BlockType candidate = area.get(chestLocation);
        if (isChest(candidate.getType())) {
            final org.bukkit.Location chestMainLocation = chestLocation.toLocation(world);
            final fr.zcraft.zbanque.structure.containers.Container newContainer = new fr.zcraft.zbanque.structure.containers.Container(chestMainLocation, getOtherChestPart(chestMainLocation, candidate.getType()));
            if (addIfNotExcluded(currentSilo, currentSilo, newContainer)) {
                lookupForChestsInSilo(newContainer);
            }
        }
    } catch (java.lang.IllegalArgumentException ignored) {
    }
}