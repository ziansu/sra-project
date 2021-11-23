@java.lang.Override
public void makeNextMove(int currentPosition, int yourEnergy, int opponentEnergy) {
    updateEnergy((-yourEnergy));
    getGameMaster().listenToPlayerMove(this, yourEnergy);
}