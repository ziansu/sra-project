@java.lang.Override
public float getEnergyDemand(net.minecraft.tileentity.TileEntity te, cyano.poweradvantage.api.ConduitType powerType) {
    if (te instanceof cyano.poweradvantage.api.modsupport.IEnergyReceiver) {
        cyano.poweradvantage.api.modsupport.IEnergyReceiver r = ((cyano.poweradvantage.api.modsupport.IEnergyReceiver) (te));
        float rfDeficit = (r.getMaxEnergyStored(EnumFacing.UP)) - (r.getEnergyStored(EnumFacing.UP));
        return rfDeficit / (conversionTable.get(powerType).floatValue());
    }else {
        return 0;
    }
}