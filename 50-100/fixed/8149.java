@java.lang.Override
public void doDetection(java.util.Collection<? extends de.leifaktor.robbie.api.controllers.collision.Collideable> collideables) {
    collideables.stream().flatMap(( c1) -> collideables.stream().map(( c2) -> makePair(c1, c2))).filter(( pair) -> (pair.distance()) < (limit)).forEach(( pair) -> pair.collide(provider));
}