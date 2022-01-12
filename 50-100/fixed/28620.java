public void moveAsSlowlyAs(Car car) {
    if (((speed) > (car.getSpeed())) && ((car.getSpeed()) != 0))
        speed = java.lang.Math.abs(((car.getSpeed()) - 0.03));
    
    if ((car.getSpeed()) == 0)
        speed = 0;
    
}