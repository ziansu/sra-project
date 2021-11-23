public void addBooking(Model.Booking b) {
    b.setId(id);
    db.add(b);
    (id)++;
}