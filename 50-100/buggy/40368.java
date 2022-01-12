public void onHitByBullet(jra.HitByBulletEvent e) {
    log("\tHit, bearing %s", e.getBearing());
    if ((getDistanceRemaining()) == 0) {
        setTurnRight((90 + ((e.getBearing()) * (hitTurnDirection))));
        setAhead(100);
    }
    hitTurnDirection *= -1;
}