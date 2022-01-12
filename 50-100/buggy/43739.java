private void updateModBlock() {
    if (isNotAlreadyUpdating) {
        isNotAlreadyUpdating = false;
        worldObj.markBlockForUpdate(pos);
        this.worldObj.updateComparatorOutputLevel(this.pos, this.getBlockType());
        if ((otherTank) != null) {
            otherTank.updateModBlock();
        }
    }
    isNotAlreadyUpdating = true;
}