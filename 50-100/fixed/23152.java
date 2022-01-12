private boolean canWork() {
    if (((bottomTank) == null) || ((topTank) == null)) {
        return false;
    }
    if ((topTank.getFluidAmount()) < (ConfigMachines.Purifier.rclPerPurify)) {
        return false;
    }
    if (topTank.getMultiBlock().equals(bottomTank.getMultiBlock())) {
        return true;
    }
    if (!(fillBottomTank())) {
        return false;
    }
    return true;
}