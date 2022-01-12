public void onHitByBullet(jra.HitByBulletEvent e) {
    if ((getDistanceRemaining()) == 0) {
        setTurnRight((90 + ((e.getBearing()) * (hitTurnDirection))));
        setAhead(100);
        hitTurnDirection *= -1;
    }
}