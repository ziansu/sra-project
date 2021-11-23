private antgameproject.Instruction getInstruction(antgameproject.Colour antColour, int brainState) {
    if (antColour == (Colour.RED)) {
        return playerOne.getInstruction(brainState);
    }else {
        return playerTwo.getInstruction(brainState);
    }
}