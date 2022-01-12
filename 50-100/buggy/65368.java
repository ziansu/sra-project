public void setActingRankChase(com.cjmalloy.stratego.Rank r) {
    if ((r == (Rank.NIL)) && ((moves) != 0))
        moves = 1;
    
    if (r == (Rank.UNKNOWN)) {
        if ((actingRankFleeLow) == (Rank.UNKNOWN))
            actingRankFleeLow = Rank.NIL;
        
        if ((actingRankFleeHigh) == (Rank.UNKNOWN))
            actingRankFleeHigh = Rank.NIL;
        
    }
    actingRankChase = r;
}