public void checkOut(Patron p) {
    if (canCheckOutBook()) {
        checkedOutThisBook.add(p);
    }
}