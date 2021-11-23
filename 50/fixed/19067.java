@Optional.Method(modid = "IC2")
protected void removeFromIc2EnergyNetwork() {
    MinecraftForge.EVENT_BUS.post(new ic2.api.energy.event.EnergyTileUnloadEvent(this));
}