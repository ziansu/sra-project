private boolean isPromotion(final de.htwsaar.chessbot.engine.model.Position start, final de.htwsaar.chessbot.engine.model.Position target) {
    if (isWhite())
        if (((start.rank()) == 7) && ((target.rank()) == 8))
            return true;
        else
            if (((start.rank()) == 2) && ((target.rank()) == 1))
                return true;
            
        
    
    return false;
}