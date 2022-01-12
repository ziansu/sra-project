public long requestBook(long bookId) throws library_project.models.BookIsOutException {
    library_project.models.Reservation newReservation = null;
    synchronized(this) {
        if (!(isOut(bookId))) {
            newReservation = new library_project.models.Reservation(bookId);
            allReservations.add(newReservation);
            return newReservation.getId();
        }
    }
    throw new library_project.models.BookIsOutException();
}