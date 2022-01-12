public void attackB(Player player) {
    int damage;
    if ((super.d20()) > 8) {
        damage = super.d6();
        java.lang.System.out.println((((("The " + (name)) + " attacks you for ") + damage) + " damage."));
    }else {
        damage = 0;
        java.lang.System.out.println((("The " + (name)) + " misses with his attack."));
    }
    player.takeDamage(damage);
}