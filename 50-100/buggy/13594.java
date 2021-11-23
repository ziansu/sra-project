public boolean canModifyEvent(java.lang.String reservationId, org.rapla.entities.User user) {
    org.rapla.entities.storage.EntityResolver resolver = operator;
    org.rapla.entities.domain.Reservation reservation = resolver.tryResolve(reservationId, org.rapla.entities.domain.Reservation.class);
    boolean canModify = (reservation != null) && (canModify(reservation, user));
    return canModify;
}