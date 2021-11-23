private void setTotalCheckins(hotelmanagement.RoomTypeEnum roomType, int month) {
    TotalCheckins = 0;
    for (hotelmanagement.Reservation res : TheArchives) {
        if (((res.IsCheckedIn()) && (res.getRoom().getType().equals(roomType.toString()))) && ((res.getStartDate().getMonth()) == month)) {
            (TotalCheckins)++;
        }
    }
}