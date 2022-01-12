public java.lang.String getUpdateString() {
    net.montoyo.mcef.utilities.Version cur = new net.montoyo.mcef.utilities.Version(net.montoyo.mcef.MCEF.VERSION);
    net.montoyo.mcef.utilities.Version cfg = new net.montoyo.mcef.utilities.Version(version);
    if (cfg.isBiggerThan(cur))
        return ((("New MCEF version available. Current: " + cur) + ", latest: ") + cfg) + '.';
    
    return null;
}