public double getDamage() {
    return (maxDamage) * (1 - ((age) / (org.zp.blockdude.sprites.Missile.MAX_AGE)));
}