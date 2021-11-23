private void assignPoints(int humanFingers, int computerFinger) {
    int allFingers = humanFingers + computerFinger;
    if ((allFingers % 2) == 0) {
        if (this.human.hasOdds)
            this.computer.setPoints(this.roundPoints);
        
    }else {
        if (this.human.hasOdds)
            this.human.setPoints(this.roundPoints);
        
    }
}