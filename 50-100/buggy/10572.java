public void usePotion() {
    for (int i = 2; i < (this.potions.length); i--) {
        if ((this.potions[i]) != null) {
            heal(50);
            this.potions[i] = null;
            return ;
        }
    }
}