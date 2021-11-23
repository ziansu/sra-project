public ftb.lib.mod.net.IMessage onMessage(ftb.lib.mod.net.MessageContext ctx) {
    ftb.lib.mod.net.MessageReload.readSyncedConfig(io);
    boolean hasFTBU = io.readBoolean();
    boolean first = (FTBWorld.client) == null;
    if (first)
        FTBWorld.client = new ftb.lib.mod.net.FTBWorld(cpw.mods.fml.relauncher.Side.CLIENT);
    
    FTBWorld.client.readReloadData(io);
    new ftb.lib.api.EventFTBWorldClient(FTBWorld.client).post();
    if ((first && hasFTBU) && ((FTBLib.ftbu) != null))
        FTBLib.ftbu.readWorldData(io);
    
    return null;
}