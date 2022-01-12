private static int getFishNumber(debugUI.paintIt.Fish fish) {
    int number = 0;
    number += fish.getTeamNumber();
    if (fish.isQueen()) {
        number += 2;
    }
    if (fish.isSick()) {
        number += 8;
    }
    if ((fish.getColorNumber()) == 0) {
        number += 4;
    }
    return number;
}