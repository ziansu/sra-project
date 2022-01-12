@java.lang.Override
public void handleEverythingWithCarsAndStoppingAndGoingAndTargetSpeedAndEverything(simulator.models.CarManager car, simulator.models.StopLight light) {
    car.moveCarForward();
    double carPosition = car.getPosition();
    if (carPosition >= (light.getPosition())) {
        java.lang.System.out.println("a");
        if (carPosition < (car.getDestination())) {
            algorithm(car, light);
        }
    }else {
        java.lang.System.out.println("b");
    }
    simulator.outputter.Outputter.getOutputter().addCarOutput(car);
}