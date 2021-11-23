public float destroy() {
    gmScr.toDestroy.add(body);
    this.gmScr.world.destroyBody(body);
    return 5.0F;
}