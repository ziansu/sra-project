public void moveAsSlowlyAs(Car car) {
    if (((this.speed) > (car.getSpeed())) && ((car.getSpeed()) != 0))
        speed = java.lang.Math.abs(((car.getSpeed()) - 0.03));
    
    if ((car.getSpeed()) == 0)
        this.speed = 0;
    
}