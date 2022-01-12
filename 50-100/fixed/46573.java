public void updateEntity() {
    super.updateEntity();
    if (!(worldObj.isRemote)) {
        checkForChanges();
        checkInventory();
        if (isBurning()) {
            useCobbleGen();
            if (!(isDone())) {
                mine();
            }
        }
    }
}