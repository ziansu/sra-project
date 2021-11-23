@java.lang.Override
public float reportRayFixture(net.net63.codearcade.LSD.systems.Fixture fixture, com.badlogic.gdx.math.Vector2 point, com.badlogic.gdx.math.Vector2 normal, float fraction) {
    if (((fixture.getFilterData().categoryBits) & (Constants.MaskBits.LASER)) == 0) {
        return -1;
    }
    laserHitPos.set(point);
    laserHit = true;
    return fraction;
}