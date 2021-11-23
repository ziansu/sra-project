public boolean checkMultiblock() {
    boolean prevState = isMultiblockStructurePresent();
    makeo.gadomancy.common.utils.MultiblockHelper.MultiblockPattern patternToCheck;
    if (prevState) {
        if (isInMultiblock()) {
            patternToCheck = makeo.gadomancy.common.registration.RegisteredMultiblocks.completeNodeManipulatorMultiblock;
        }else {
            patternToCheck = makeo.gadomancy.common.registration.RegisteredMultiblocks.incompleteNodeManipulatorMultiblock;
        }
        this.multiblockStructurePresent = makeo.gadomancy.common.utils.MultiblockHelper.isMultiblockPresent(worldObj, xCoord, yCoord, zCoord, patternToCheck);
    }else {
        patternToCheck = makeo.gadomancy.common.registration.RegisteredMultiblocks.incompleteNodeManipulatorMultiblock;
        this.multiblockStructurePresent = makeo.gadomancy.common.utils.MultiblockHelper.isMultiblockPresent(worldObj, xCoord, yCoord, zCoord, patternToCheck);
    }
    markDirty();
    return isMultiblockStructurePresent();
}