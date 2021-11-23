@java.lang.Override
public boolean book(com.real.apps.shuttle.domain.model.Vehicle vehicle, com.real.apps.shuttle.domain.model.BookedRange bookedRange) {
    boolean bookable = bookedRangeService.availableForBooking(vehicle.getBookedRanges(), bookedRange);
    if (bookable) {
        vehicle = repository.findOne(vehicle.getId());
        vehicle.getBookedRanges().add(bookedRange);
        repository.save(vehicle);
        return true;
    }
    return false;
}