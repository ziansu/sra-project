@java.lang.Override
public boolean equals(java.lang.Object other) {
    if (other == null)
        return false;
    
    if (other == (this))
        return true;
    
    if (!(other instanceof model.Chapter))
        return false;
    
    if ((((model.Chapter) (other)).getId()) == 0)
        return false;
    
    if ((((model.Chapter) (other)).getId()) == (this.id))
        return true;
    
    return false;
}