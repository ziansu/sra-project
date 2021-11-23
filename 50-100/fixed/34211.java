public void givePotion() {
    for (int i = 0; i < (this.potions.length); i++) {
        if ((this.potions[i]) == null) {
            this.potions[i] = new dungeonhunt.entity.Potion("Healing potion", "Heals 50HP");
            break;
        }
    }
}