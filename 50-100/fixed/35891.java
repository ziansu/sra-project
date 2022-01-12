private static void setupState(java.util.Scanner parser, Board board) {
    java.lang.String token;
    while (parser.hasNext()) {
        token = parser.next();
        if (token.equals("fen"))
            board.setup(parser.next());
        else
            if (token.equals("startpos"))
                board.setup(Board.STARTFEN);
            else
                if (token.equals("moves"))
                    continue;
                else
                    board.movePiece(new Move(token));
                
            
        
    } 
}