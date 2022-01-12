public void fireProjectile(float angle, float xPos, float yPos) {
    projectileSprite.setRotation((-angle));
    new com.github.houkagoteatime.LD36.weapons.GateOfBabylon.SwordProjectile(projectileSprite, owner.getDamage(), xPos, yPos, angle, range, friendly).spawn(level);
    java.lang.System.out.println("attack");
}