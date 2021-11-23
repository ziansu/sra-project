private is.TicTacToe.data.Player GetPlayerBySymbol(java.lang.String symbol) {
    if ((p1.GetSymbol()) == symbol) {
        return p1;
    }else
        if ((p1.GetSymbol()) == symbol) {
            return p2;
        }else {
            return null;
        }
    
}