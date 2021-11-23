@java.lang.Override
public void update(float delta) {
    bulletsToRemove.clear();
    for (lando.systems.lordsandships.entities.Bullet bullet : bullets) {
        if (bullet.isAlive())
            bullet.update(delta);
        else
            bulletsToRemove.add(bullet);
        
    }
    bullets.removeAll(bulletsToRemove, true);
    if ((attacking) && ((attackCooldown -= delta) < 0.0F)) {
        attacking = false;
    }
}