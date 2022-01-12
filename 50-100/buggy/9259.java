public java.lang.String receiptClearRoom() {
    java.lang.String receipt = (((("Rechnung f�r Gast " + (guests[0].getName())) + ": ") + (calcPrice())) + " f�r ") + (roomtype);
    this.booked = false;
    this.guests = null;
    this.daysBooked = 0;
    return receipt;
}