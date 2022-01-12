void loseItems(int numItems) {
    if (numItems == (-1)) {
        this.listCards = new java.util.ArrayList<>();
    }else {
        for (int i = 0; i < numItems; i++) {
            if ((listCards.size()) > 0) {
                this.listCards.remove(i);
            }
        }
    }
    updateCombatLevel();
}