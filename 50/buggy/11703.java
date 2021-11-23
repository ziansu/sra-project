private boolean checkOverdue() {
    if (this.end.isEndTimePassCurrentTime()) {
        return true;
    }else {
        return false;
    }
}