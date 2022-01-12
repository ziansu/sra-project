public boolean step() {
    resetUpdates();
    executeOneStep();
    _mp.highlightChar(_pa, _x, _y);
    _mp.setStack(_ps.toString());
    _mp.refresh(_updateTa, _updateStack, _updateOutput);
    return _programComplete;
}