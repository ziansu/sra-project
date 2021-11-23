@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (obj == null)
        return false;
    
    if ((getClass()) != (obj.getClass()))
        return false;
    
    org.amc.game.chess.Location other = ((org.amc.game.chess.Location) (obj));
    if ((letter) != (other.letter))
        return false;
    
    return (number) == (other.number);
}