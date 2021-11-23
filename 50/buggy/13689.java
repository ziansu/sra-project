public int getMissilesLeft(int playerID) {
    assert playerID < 2;
    assert playerID >= 0;
    return (stats.get(playerID).nMissiles) - (battle.SimpleBattle.nMissiles);
}