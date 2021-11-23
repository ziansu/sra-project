private static boolean containsFreeOneOrFive() {
    for (int i = 1; i <= (model.CrapsModel.NUMBER_OF_DICES); i++) {
        model.DiceModel dice = model.CrapsModel.dices.get(i);
        boolean oneFound = (dice.getValue()) == 1;
        boolean fiveFound = (dice.getValue()) == 5;
        boolean fixed = dice.isFixed();
        if ((oneFound || fiveFound) && (!fixed)) {
            return true;
        }
    }
    return false;
}