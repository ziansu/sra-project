@java.lang.Override
public boolean EM_checkMachine(gregtech.api.interfaces.tileentity.IGregTechTileEntity iGregTechTileEntity, net.minecraft.item.ItemStack itemStack) {
    if (!(EM_StructureCheckAdvanced(com.github.technus.tectech.thing.metaTileEntity.multi.GT_MetaTileEntity_EM_scanner.shape, com.github.technus.tectech.thing.metaTileEntity.multi.GT_MetaTileEntity_EM_scanner.blockType, com.github.technus.tectech.thing.metaTileEntity.multi.GT_MetaTileEntity_EM_scanner.blockMeta, com.github.technus.tectech.thing.metaTileEntity.multi.GT_MetaTileEntity_EM_scanner.addingMethods, com.github.technus.tectech.thing.metaTileEntity.multi.GT_MetaTileEntity_EM_scanner.casingTextures, com.github.technus.tectech.thing.metaTileEntity.multi.GT_MetaTileEntity_EM_scanner.blockTypeFallback, com.github.technus.tectech.thing.metaTileEntity.multi.GT_MetaTileEntity_EM_scanner.blockMetaFallback, 2, 2, 0)))
        return false;
    
    return (((eInputHatches.size()) == 1) && ((eOutputHatches.size()) == 1)) && ((eOutputHatches.get(0).getBaseMetaTileEntity().getFrontFacing()) == (iGregTechTileEntity.getFrontFacing()));
}