public void refill() {
    for (int i = 80; i >= 0; i--) {
        if (!(squares[i].isSatisfied()))
            this.pullDown(i);
        
    }
    this.isComplete();
}