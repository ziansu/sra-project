public double getCurrentSpeed() {
    if ((!(this.isMoving())) && (!(this.isFalling())))
        return 0.0;
    
    return ((hillbillies.model.Move) (this.getCurrentActivity())).getCurrentSpeed();
}