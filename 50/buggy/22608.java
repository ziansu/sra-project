public float destroy() {
    gmScr.toDestroy.add(body);
    gmScr.world.destroyBody(body);
    return 1.5F;
}