public java.lang.String getStatus() {
    java.lang.String strEnergyStatus = getEnergyStatus();
    return (((worldObj) != null ? net.minecraft.util.StatCollector.translateToLocalFormatted("warpdrive.guide.prefix", getBlockType().getLocalizedName()) : "") + (getBeamFrequencyStatus())) + (strEnergyStatus.isEmpty() ? "" : "\n" + strEnergyStatus);
}