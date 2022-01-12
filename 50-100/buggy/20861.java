@java.lang.Override
public int getCapacity() {
    net.minecraftforge.items.IItemHandler handler = getItemHandler();
    if (handler != null) {
        return (handler.getSlots()) * 64;
    }else {
        powercrystals.minefactoryreloaded.api.IDeepStorageUnit storageUnit = getStorageUnit();
        if (storageUnit != null) {
            return storageUnit.getMaxStoredCount();
        }
    }
    return 0;
}