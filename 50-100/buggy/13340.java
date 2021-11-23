public int takeDamage(int damageDone) {
    health -= damageDone;
    java.lang.System.out.println(((("Entity " + (this.getID())) + "has taken damage. New health: ") + (health)));
    if ((health) <= 0) {
        super.destroy();
    }
    return health;
}