@java.lang.Override
public void updateReservation(com.meetingroom.domainmodel.entities.Reservation reservation) {
    com.meetingroom.domainmodel.entities.Reservation existingReservation = this.reservations.get(reservation.getReservationNumber());
    existingReservation = com.meetingroom.domainmodel.factories.ReservationBuilder.fromExistingReservation(reservation).build();
    this.reservations.put(existingReservation.getReservationNumber(), existingReservation);
}