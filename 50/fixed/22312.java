@java.lang.Override
public void makeNextMove(int currentPosition, int yourEnergy, int opponentEnergy) {
    getGameMaster().listenToPlayerMove(this, yourEnergy);
}