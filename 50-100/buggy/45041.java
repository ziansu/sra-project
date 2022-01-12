public boolean isVerticalAlignment(com.louloux.view.CaseState state) {
    for (int x = 0; x < (this.states[0].length); x++) {
        if (areCaseStatesEquals(states[0][x], states[1][x], states[2][x]))
            return true;
        
    }
    return false;
}