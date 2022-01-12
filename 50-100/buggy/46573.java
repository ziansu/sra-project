public void updateEntity() {
    super.updateEntity();
    if (!(worldObj.isRemote)) {
        checkForChanges();
        checkInventory();
        if ((!(isDone())) && (isBurning())) {
            useCobbleGen();
            mine();
        }
    }
}