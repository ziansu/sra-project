private void createParticleBurst(java.lang.String burstIndex, com.badlogic.gdx.math.Vector2 position, java.lang.String type) {
    particleBurstAnimation = new com.platform.rider.world.ParticleBurstAnimation(burstIndex, position, type);
    particleBurstHashMap.put(java.lang.String.valueOf(burstIndex), particleBurstAnimation);
}