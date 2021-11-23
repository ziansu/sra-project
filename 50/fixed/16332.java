public void setMaybeEight(boolean b) {
    if (b)
        flags |= com.cjmalloy.stratego.Piece.MAYBE_EIGHT;
    else
        flags &= ~(com.cjmalloy.stratego.Piece.MAYBE_EIGHT);
    
}