public void reaction() {
    nbasim.Team defense = game.other(offense);
    if (made) {
        offense.defense();
        defense.offense();
    }else {
        offense.limbo();
        defense.limbo();
    }
}