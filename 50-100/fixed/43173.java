public at.jku.ce.CoMPArE.process.State setFirstState(at.jku.ce.CoMPArE.process.State firstState) {
    if (firstState == null) {
        this.firstState = null;
        return null;
    }
    if (!(states.contains(firstState))) {
        states.add(firstState);
        firstState.setParentSubject(this);
    }
    this.firstState = firstState.getUUID();
    return firstState;
}