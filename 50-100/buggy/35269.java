public java.lang.String processCommand(java.lang.String command, java.lang.String firstName) throws lottery.exception.UnknowCommandExcpetion {
    switch (command.toLowerCase()) {
        case InputCommand.COMMAND_DO_PURCHASE :
            purchaseDraw(firstName);
            return output.getDisplayPurchase(((this.ballNumber) - 1));
    }
    throw new lottery.exception.UnknowCommandExcpetion("Unknow command");
}