public boolean tryWriteLockWithConditionState(boolean data) {
    V value = this.value;
    if ((((stateStamp) != 0) || (!(dataMatch(value, data)))) || (deleted)) {
        return false;
    }
    if (compareAndSetStateStamp(0, 1)) {
        if ((!(dataMatch(this.value, data))) || (deleted)) {
            unlockWriteState();
            return false;
        }
        return true;
    }else {
        return false;
    }
}