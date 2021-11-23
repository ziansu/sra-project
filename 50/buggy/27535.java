private void createParticleBurst(java.lang.String burstIndex, com.badlogic.gdx.math.Vector2 position) {
    particleBurstAnimation = new com.platform.rider.world.ParticleBurstAnimation(burstIndex, position);
    particleBurstHashMap.put(java.lang.String.valueOf(burstIndex), particleBurstAnimation);
}