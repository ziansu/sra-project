@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (obj == null)
        return false;
    
    if ((getClass()) != (obj.getClass()))
        return false;
    
    org.adani.hangman.model.Player other = ((org.adani.hangman.model.Player) (obj));
    return id.equals(other.id);
}