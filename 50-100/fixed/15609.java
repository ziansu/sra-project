private void assignPoints(int humanFingers, int computerFinger) {
    this.allFingers = humanFingers + computerFinger;
    if (((allFingers) % 2) == 0) {
        if (this.human.hasOdds)
            this.computer.setPoints(this.roundPoints);
        else
            this.human.setPoints(this.roundPoints);
        
    }else {
        if (this.human.hasOdds)
            this.human.setPoints(this.roundPoints);
        else
            this.computer.setPoints(this.roundPoints);
        
    }
}