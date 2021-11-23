public void addGoal(long _goal) {
    if (((this.goal) + _goal) < 0) {
        long extra = (this.goal) + _goal;
        this.goal += _goal - extra;
    }else {
        this.goal = _goal;
    }
}