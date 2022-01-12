public void initialize() {
    freeway.numberOfCars = control.getInt("Number of cars");
    freeway.roadLength = control.getInt("Road length");
    freeway.p = control.getDouble("Slow down probability");
    freeway.maximumVelocity = control.getInt("Maximum velocity");
    display.setPreferredMinMax(0, freeway.roadLength, (-3), 4);
    freeway.initialize(spaceTime);
}