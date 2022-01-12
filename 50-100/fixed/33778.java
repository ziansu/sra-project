@javafx.fxml.FXML
public void clickEditButton() {
    if (!(editMode)) {
        setEditMode(true);
    }else {
        vo.RoomChangeInfoVO roomChangeInfo = new vo.RoomChangeInfoVO(date, date, hotelRoom.hotelID, hotelRoom.roomType, ((roomStock.availableQuantity) - (availableQuantity)));
        util.ResultMessage resultMessage = hotelBLService.updateHotelRoomQuantity(roomChangeInfo);
        if (resultMessage.equals(ResultMessage.SUCCESS)) {
            roomStock.availableQuantity = availableQuantity;
            setEditMode(false);
        }else {
            java.lang.System.out.println(resultMessage);
        }
    }
}