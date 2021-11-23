@java.lang.Override
public gregtech.api.interfaces.ITexture[] getTexture(gregtech.api.interfaces.tileentity.IGregTechTileEntity aBaseMetaTileEntity, byte aSide, byte aFacing, byte aColorIndex, boolean aActive, boolean aRedstone) {
    return new gregtech.api.interfaces.ITexture[]{ Textures.BlockIcons.MACHINE_CASINGS[mTier][(aColorIndex + 1)] , aSide != aFacing ? new gregtech.api.objects.GT_RenderedTexture(Textures.BlockIcons.OVERLAY_TELEPORTER_ACTIVE) : com.github.technus.tectech.thing.metaTileEntity.single.GT_MetaTileEntity_DebugStructureWriter.MARK };
}