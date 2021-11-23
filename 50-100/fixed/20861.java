@java.lang.Override
public int getCapacity() {
    powercrystals.minefactoryreloaded.api.IDeepStorageUnit storageUnit = getStorageUnit();
    if (storageUnit != null) {
        return storageUnit.getMaxStoredCount();
    }else {
        net.minecraftforge.items.IItemHandler handler = getItemHandler();
        if (handler != null) {
            return (handler.getSlots()) * 64;
        }
    }
    return 0;
}