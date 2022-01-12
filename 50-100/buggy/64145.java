public boolean hitNextCar(double theoreticalTimeToLight, double distanceToLight) {
    simulator.models.CarManager nextCar = getLaneObject().getNextCar();
    if ((nextCar != null) && ((nextCar.getPosition()) == (this.car.getPosition()))) {
        return false;
    }else
        if ((nextCar != null) && ((nextCar.getTimeTo(nextCar.targetSpeed, distanceToLight)) < (theoreticalTimeToLight + (simulator.models.CarManager.TIME_CUSHION)))) {
            return true;
        }
    
    return false;
}