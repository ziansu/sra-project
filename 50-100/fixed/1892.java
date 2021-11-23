public void decelerate() {
    if (((this.currentSpeed) > 0) && ((this.currentRpm) > 1)) {
        (this.currentSpeed)--;
        (this.currentRpm)--;
        (this.currentMileage)++;
    }else
        if (((this.currentSpeed) > 0) && ((this.currentRpm) == 1)) {
            (this.currentSpeed)--;
            (this.currentMileage)++;
        }
    
}