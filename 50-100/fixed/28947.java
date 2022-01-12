private boolean checkValidityOfSolution(int initialRod) {
    if (!(rods.get((initialRod - 1)).isRodEmpty())) {
        return false;
    }
    int counterOfNotEmptyRods = 0;
    for (com.art.game.HanoiRod tempRod : rods) {
        if (!(tempRod.isRodEmpty())) {
            counterOfNotEmptyRods++;
        }
    }
    return counterOfNotEmptyRods == 1;
}