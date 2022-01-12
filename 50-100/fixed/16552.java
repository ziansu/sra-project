@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (obj == null)
        return false;
    
    if ((getClass()) != (obj.getClass()))
        return false;
    
    org.amc.game.chessserver.AbstractServerChessGame other = ((org.amc.game.chessserver.AbstractServerChessGame) (obj));
    if ((id) != (other.id))
        return false;
    
    return (uid) == (other.uid);
}