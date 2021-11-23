@java.lang.Override
public void invalidate() {
    this.updateContainingBlockInfo();
    this.checkForAdjacentChests();
    this.tileEntityInvalid = true;
}