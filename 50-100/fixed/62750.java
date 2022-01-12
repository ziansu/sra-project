@java.lang.Override
protected void init() {
    super.init();
    this.biomeProvider = new landmaster.landcraft.world.LandiaBiomeGenerator(world);
    if ((this.world.getWorldInfo().getTerrainType()) == (WorldType.FLAT)) {
        this.world.getWorldInfo().setTerrainType(WorldType.DEFAULT);
    }
}