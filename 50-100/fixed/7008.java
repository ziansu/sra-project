public void throwDices() {
    cup.reset();
    diceRoll.play(1.0F);
    generateRandomDices();
    stillHasToThrow = false;
    canViewOwnThrow = true;
    allowedToCall = true;
    cup.unlock();
    leftDice.unlock();
    middleDice.unlock();
    rightDice.unlock();
    userInterface.log("Now enter your call ...");
}