private void validateSeat(pl.com.bottega.cinemac.model.commands.ValidationErrors errors, pl.com.bottega.cinemac.model.showing.Seat seat) {
    if ((seat.getSeat()) == null)
        errors.add("seat", "Field cant be blank");
    
    if (((seat.getSeat()) > (pl.com.bottega.cinemac.model.commands.CreateReservationCommand.MAX_SEAT)) && ((seat.getSeat()) < (pl.com.bottega.cinemac.model.commands.CreateReservationCommand.MIN_SEAT)))
        errors.add("seat", "Max seat is 15, Min seat is 1");
    
}