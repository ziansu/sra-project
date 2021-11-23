public java.lang.String receiptClearRoom() {
    java.lang.String receipt = (((("Rechnung f�r Gast " + (guests[0].getName())) + ": ") + (calcPrice())) + " f�r ") + (roomtype);
    this.booked = false;
    for (int i = 0; i < (guests.length); i++) {
        guests[i] = null;
    }
    this.daysBooked = 0;
    return receipt;
}