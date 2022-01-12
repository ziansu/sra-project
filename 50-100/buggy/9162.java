public void confirmAttack(int nrD, risiko.players.ArtificialPlayer... aiCaller) throws exceptions.PlayerLossException, exceptions.WrongCallerException {
    if (!(canCallDefenseMethods(aiCaller))) {
        throw new exceptions.WrongCallerException();
    }
    this.nrD = nrD;
    fight();
    checkCountryConquest();
    attackInProgress = false;
}