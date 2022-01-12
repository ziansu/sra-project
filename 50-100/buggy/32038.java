public java.lang.String processCommand(java.lang.String command) throws lottery.exception.DrawFinishedException, lottery.exception.MinParticipantsNotReachException, lottery.exception.NoAvailableSpotException, lottery.exception.UnknowCommandExcpetion, lottery.exception.WinnerNotDrawnException {
    switch (command.toLowerCase()) {
        case InputCommand.COMMAND_TO_RESTART :
            initDraw();
            return Output.NEW_DRAW_START;
        case InputCommand.COMMAND_TO_PURCHASE :
            preparePurchaseDraw();
            return "";
        case InputCommand.COMMAND_TO_DRAW :
            drawWinner();
            return Output.WINNNER_DRAW_FINISHED;
        case InputCommand.COMMAND_TO_DISPLAY_WINNERS :
            return output.getDisplayWinners(this.winners);
    }
    throw new lottery.exception.UnknowCommandExcpetion("Unknow command");
}