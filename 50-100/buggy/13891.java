public java.lang.String positionCharacter(int index) {
    game.Player playerOccupying = board.getPos(index).getPlayerOccupying();
    if (playerOccupying == null) {
        if (index <= 9) {
            return (" " + index) + " ";
        }else
            return (java.lang.Integer.toString(index)) + " ";
        
    }else
        return (" " + (playerOccupying.getSymbol())) + " ";
    
}