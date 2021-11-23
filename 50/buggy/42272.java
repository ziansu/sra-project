public void increaseCurrentMana(int mana) {
    if (((currentMana) + mana) > (this.mana)) {
        currentMana = getMana();
    }else {
        currentMana += mana;
    }
}