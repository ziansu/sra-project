private static int squareToInt(Square sq) {
    if (sq == null) {
        return -2;
    }else
        if (sq.flagged) {
            return 9;
        }else
            if (!(sq.shown)) {
                return -2;
            }else {
                return sq.value;
            }
        
    
}