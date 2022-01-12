public org.interpss.pssl.simu.IpssDStab setRefMachine(java.lang.String refMachId) {
    if ((dstabNet.getMachine(refMachId)) != null)
        this.dstabAlgo.setRefMachine(dstabNet.getMachine(refMachId));
    else {
        com.interpss.common.util.IpssLogger.getLogger().severe((("No machine is found for the input " + refMachId) + ", please check!"));
    }
    return this;
}