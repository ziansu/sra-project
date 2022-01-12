public java.lang.String reserveSeats(int seatHoldId, java.lang.String customerEmail) {
    ticketservice.seating.SeatHold heldSeats = getPendingReservationById(seatHoldId);
    if ((heldSeats == null) || (heldSeats.getSeats().get(0).isAvailable())) {
        return null;
    }
    ticketservice.seating.SeatReserved seats = new ticketservice.seating.SeatReserved(heldSeats);
    this.resertations.add(seats);
    return seats.getSeatReserveId();
}