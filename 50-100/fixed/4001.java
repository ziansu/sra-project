@java.lang.Override
protected void throwDice() {
    if ((result) != null) {
        dice.getDice()[0].setValue(result[0]);
        dice.getDice()[1].setValue(result[1]);
    }else {
        dice.throwDice();
    }
    setDice(dice);
    controller.GUIController.setDice(dice);
}