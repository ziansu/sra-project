private void setTotalIncome(hotelmanagement.RoomTypeEnum roomType, int month) {
    totalIncome = 0.0;
    for (hotelmanagement.Reservation res : TheArchives) {
        if (((res.getIsPaid()) && (res.getRoom().getType().equals(roomType))) && ((res.getStartDate().getMonth()) == (month - 1))) {
            totalIncome += res.getTotalPrice();
        }
    }
}