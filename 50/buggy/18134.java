public boolean tryBreakingOutOfJail(java.util.Random random) throws java.lang.InterruptedException {
    clientInfo.sendCommandToClient("Print~You try to roll a double to get out of jail.\r\n", 2);
    if (diceRoll(random, true)) {
        clientInfo.sendCommandToClient("Print~You break out of jail.\r\n", 2);
        return true;
    }else {
        return false;
    }
}