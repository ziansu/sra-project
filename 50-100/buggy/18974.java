@java.lang.Override
public void cancelReservation(java.lang.String reservationNumber) {
    com.meetingroom.domainmodel.entities.Reservation existingReservation = this.reservations.get(reservationNumber);
    existingReservation = com.meetingroom.domainmodel.factories.ReservationBuilder.fromExistingReservation(existingReservation).withStatus(Status.STATUS_CANCELED).build();
    this.reservations.put(existingReservation.getReservationNumber(), existingReservation);
}