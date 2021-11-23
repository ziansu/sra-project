public void increaseCurrentMana(int mana) {
    if (((currentMana) + mana) > (getMana())) {
        currentMana = getMana();
    }else {
        currentMana += mana;
    }
}