public void increment() {
    (this.currentRange)++;
    if ((this.currentRange) >= ((this.totalRange) - 1))
        end();
    
}