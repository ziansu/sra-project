public void checkReservationsOnRoom(com.flames.organizer.buttons.mainWindowButtons.Room room) {
    roomToRemove = room;
    if ((rooms.size()) > 0) {
        for (com.flames.organizer.Customer customer : customers) {
            if ((customer.getCustomerBar().getRect().y) == (room.getRect().y)) {
                removeRoomMsg = new com.flames.organizer.windows.PopUpMessage(2, "ΠΡΟΣΟΧΗ", "Υπάρχει καταχωρημένη κράτηση σε αυτό το δωμάτιο. Είστε σίγουροι ότι θέλετε να το διαγράψετε;", wm);
                wm.set(removeRoomMsg);
                break;
            }
        }
    }
}