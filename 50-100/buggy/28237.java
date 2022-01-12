public boolean isDiagonalAlignment(com.louloux.view.CaseState state) {
    if (areCaseStatesEquals(this.states[0][0], this.states[1][1], this.states[2][2]))
        return true;
    else
        if (areCaseStatesEquals(this.states[0][2], this.states[1][1], this.states[2][0]))
            return true;
        
    
    return false;
}