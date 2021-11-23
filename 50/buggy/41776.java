void update_bullet(Protocols.Bullet bullet) {
    UDPUS.ArrayList<Protocols.Bullet> bullets = new UDPUS.ArrayList<Protocols.Bullet>();
    bullets.add(bullet);
    dynamic_object.updateBullet(bullets);
}