void setMaxDice() {
    maxInvDice = de.htwg.risiko.turn.InvadeTurn.MAX_RECRUITMENT;
    if ((invadingCountry.getSoldiers()) < (de.htwg.risiko.turn.InvadeTurn.MAX_RECRUITMENT)) {
        maxInvDice = invadingCountry.getSoldiers();
    }
    maxDefDice = 2;
    if ((defendingCountry.getSoldiers()) < 2) {
        maxDefDice = defendingCountry.getSoldiers();
    }
}