@java.lang.Override
public boolean isTriggerActive(net.minecraft.tileentity.TileEntity tile, net.minecraftforge.common.util.ForgeDirection side, buildcraft.api.statements.IStatementContainer source, buildcraft.api.statements.IStatementParameter[] parameters) {
    if (!(tile instanceof forestry.farming.tiles.TileFarmHatch)) {
        return false;
    }
    forestry.farming.tiles.TileFarmHatch tileHatch = ((forestry.farming.tiles.TileFarmHatch) (tile));
    net.minecraft.inventory.IInventory germlingsInventory = tileHatch.getMultiblockLogic().getController().getFarmInventory().getGermlingsInventory();
    return !(forestry.core.utils.InventoryUtil.containsPercent(germlingsInventory, threshold));
}