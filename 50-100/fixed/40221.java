@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (obj == null)
        return false;
    
    if ((getClass()) != (obj.getClass()))
        return false;
    
    ch.unibe.ese.team3.model.Picture other = ((ch.unibe.ese.team3.model.Picture) (obj));
    if ((id) != (other.id))
        return false;
    
    if (!(this.filePath.equals(other.filePath)))
        return false;
    
    return true;
}