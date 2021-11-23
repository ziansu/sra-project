public static int getEpForPlayerLevelUp(int playerLevel) {
    return ((int) ((com.pemws14.armyoffriends.GameMechanics.EP_BLOW_UP) * (java.lang.Math.pow(playerLevel, 2.0))));
}