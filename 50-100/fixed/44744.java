public void updateState() {
    if ((this.state) == (com.lifemm.game.Waldo.BUILDING)) {
        if ((this.timeInState) > 100) {
            this.setState(com.lifemm.game.Waldo.MOVING);
        }
    }else
        if (((this.state) == (com.lifemm.game.Waldo.ATTACKING)) && ((this.timeInState) > 40)) {
            this.setState(com.lifemm.game.Waldo.MOVING);
        }
    
}