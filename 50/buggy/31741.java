public boolean continueBattle() {
    if ((battleEnd) && (win)) {
        current.gainEXP(opponent.giveEXP());
    }
    return !(battleEnd);
}