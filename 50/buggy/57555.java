public void applyStamina(int stamina) {
    int maxStamina = stats.getMaxStamina();
    this.stamina += stamina;
    if (stamina > maxStamina) {
        stamina = maxStamina;
    }
}