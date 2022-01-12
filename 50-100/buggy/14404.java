private void step() {
    if ((((container) != null) && ((container.getWorldObj()) != null)) && ((currentDate) != (container.getWorldObj().getTotalWorldTime()))) {
        currentDate = container.getWorldObj().getTotalWorldTime();
        powerQuery = nextPowerQuery;
        nextPowerQuery = new int[6];
        int[] next = internalPower;
        internalPower = internalNextPower;
        internalNextPower = internalPower;
    }
}