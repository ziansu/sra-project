@java.lang.Override
public int getSizeInventory() {
    if ((host) instanceof trains.entities.EntityTrainCore) {
        int size = 1;
        if (((host.getType()) == (TrainsInMotion.transportTypes.STEAM)) || ((host.getType()) == (TrainsInMotion.transportTypes.NUCLEAR_STEAM))) {
            size = 2;
        }
        return size + ((host.getInventorySize().getCollumn()) * (host.getInventorySize().getRow()));
    }
    return 0;
}