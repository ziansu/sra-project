public void newMaxFighterHealth() {
    this.fighterMaxHealth += battlemen.Dice.rollDice(healthDie, 1);
    java.lang.System.out.println((("You leveled up! Your Max Health is now " + (this.fighterMaxHealth)) + " !"));
    this.fighterHealth = this.fighterMaxHealth;
    java.lang.System.out.println(((("You currently have " + (this.fighterHealth)) + " HP out of ") + (this.fighterMaxHealth)));
}