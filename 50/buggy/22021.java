public de.pandigo.cars.models.car.CarBuilder withNumberOfSeats(final int numberOfSeats) {
    if ((numberOfSeats < 1) && (numberOfSeats > (de.pandigo.cars.models.car.CarBuilder.MAX_SEATS_POSSIBLE))) {
        throw new de.pandigo.cars.exceptions.CarConfigRuntimeException("The amount of seats you have chosen is not allowed.");
    }
    this.car.setSeats(numberOfSeats);
    return this;
}