private void setTotalIncome(hotelmanagement.RoomTypeEnum roomType, int month) {
    totalIncome = 0.0;
    for (hotelmanagement.Reservation res : TheArchives) {
        if (((res.getIsPaid()) && (res.getRoom().getType().equals(roomType.toString()))) && ((res.getStartDate().getMonth()) == month)) {
            totalIncome += res.getTotalPrice();
        }
    }
}