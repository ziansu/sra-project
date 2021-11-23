@java.lang.Override
public void onBulletHit(baver.BulletHitEvent e) {
    learningGun.registerBulletHit(e.getBullet());
}