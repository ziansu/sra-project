private void updateActive(int weapon, com.badlogic.gdx.math.Vector2 target, boolean fire) {
    aurumvorax.arcturus.artemis.components.Turret t = aurumvorax.arcturus.artemis.systems.WeaponsUpdate.mTurret.get(weapon);
    aurumvorax.arcturus.artemis.components.Mounted m = aurumvorax.arcturus.artemis.systems.WeaponsUpdate.mMounted.get(weapon);
    if (target == null)
        t.target = t.arcMid;
    else {
        aurumvorax.arcturus.artemis.systems.WeaponsUpdate.targetVector.set(target).sub(m.position);
        t.target = aurumvorax.arcturus.artemis.systems.WeaponsUpdate.targetVector.angle();
    }
}