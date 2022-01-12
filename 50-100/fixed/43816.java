void setupNextRound() {
    playerIds.indexOf(round.getPlayer());
    java.lang.String nextPlayer = playerIds.get((((playerIds.indexOf(round.getPlayer())) + 1) % (playerIds.size())));
    round = new org.freehat.particles.game.GameRound(nextPlayer, org.freehat.particles.game.Particle.randomParticles(level, (((getScore()) / (playerIds.size())) + 1)));
}