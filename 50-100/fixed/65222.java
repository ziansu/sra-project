public boolean download(net.montoyo.mcef.utilities.IProgressListener ipl) {
    java.lang.String end = "";
    if (shouldExtract)
        end += ".gz";
    
    return net.montoyo.mcef.utilities.Util.download(((((((net.montoyo.mcef.MCEF.VERSION) + '/') + (platform)) + '/') + (name)) + end), new java.io.File(net.montoyo.mcef.client.ClientProxy.ROOT, name), shouldExtract, ipl);
}