public com.levigilad.javaplay.tictactoe.TicTacToeSymbol addParticipant(java.lang.String participantId) {
    com.levigilad.javaplay.tictactoe.TicTacToeSymbol participantSymbol = TicTacToeSymbol.NONE;
    if ((mParticipants.get(TicTacToeSymbol.X)) == (com.levigilad.javaplay.tictactoe.TicTacToeTurn.NO_PARTICIPANT)) {
        participantSymbol = TicTacToeSymbol.X;
    }else
        if ((mParticipants.get(TicTacToeSymbol.O)) == (com.levigilad.javaplay.tictactoe.TicTacToeTurn.NO_PARTICIPANT)) {
            participantSymbol = TicTacToeSymbol.O;
        }
    
    mParticipants.put(participantSymbol, participantId);
    return participantSymbol;
}