protected void init() {
    initConfig();
    this.getConfig().load(this.configPath());
    this.terrain = initTerrain();
    this.surface = initSurface();
    this.surfaceRiver = new rtg.api.world.surface.SurfaceRiverOasis(config);
    this.surfaceGeneric = new rtg.api.world.surface.SurfaceGeneric(config, this.surface.getTopBlock(), this.surface.getFillerBlock());
    initDecos();
}