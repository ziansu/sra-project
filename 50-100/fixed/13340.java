public int takeDamage(int damageDone) {
    super.health -= damageDone;
    java.lang.System.out.println(((("Entity " + (this.getID())) + "has taken damage. New health: ") + (health)));
    if ((super.health) <= 0) {
        super.destroy();
    }
    return super.health;
}