public boolean isHorizontalAlignment(com.louloux.view.CaseState state) {
    for (com.louloux.view.CaseState[] caseStates : this.states) {
        if (isAlignmentIn(caseStates, state));
        return true;
    }
    return false;
}