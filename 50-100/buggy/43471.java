@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (!(obj instanceof chess.Move))
        return false;
    
    chess.Move move = ((chess.Move) (obj));
    return ((this.from) == (move.from)) && ((this.to) == (move.to));
}