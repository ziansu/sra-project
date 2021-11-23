@java.lang.Override
public void setHealth(int health) {
    if (health > (maxHealth)) {
        this.health = getMaxHealth();
    }else {
        this.health = health;
    }
}