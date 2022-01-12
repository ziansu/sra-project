public java.lang.Boolean doesTheRuleMet() {
    if ((this.stateNeeded) != null)
        if (!(this.itemToValidate.hasState(this.stateNeeded)))
            return false;
        
    
    if ((this.stateNotNeeded) != null)
        if (this.itemToValidate.hasState(this.stateNotNeeded))
            return false;
        
    
    return true;
}