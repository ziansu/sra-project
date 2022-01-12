public void attackD(Player player) {
    int damage;
    if ((super.d20()) > 15) {
        damage = super.d8();
        java.lang.System.out.println((((("The " + (name)) + " attacks you for ") + damage) + " damage."));
    }else {
        damage = 0;
        java.lang.System.out.println("The monster misses with his attack.");
    }
    player.takeDamage(damage);
}