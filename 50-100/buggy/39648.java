@org.springframework.web.bind.annotation.RequestMapping(value = "/book", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity<?> book(@org.springframework.web.bind.annotation.RequestBody
com.mtch.hmgmt.model.Room roomInput) {
    com.mtch.hmgmt.controller.RoomController.logger.info(("Obtained info for booking: " + roomInput));
    com.mtch.hmgmt.model.Room room = roomService.getRoomByRoomNo(roomInput.getRoomNo());
    if (room == null) {
        com.mtch.hmgmt.controller.RoomController.logger.error("Room with roomNo {} not found.", roomInput);
        return new org.springframework.http.ResponseEntity(new com.mtch.hmgmt.util.CustomErrorType((("Room with RoomNO " + roomInput) + " not found")), org.springframework.http.HttpStatus.NOT_FOUND);
    }
    roomService.book(room);
    return new org.springframework.http.ResponseEntity<com.mtch.hmgmt.model.Room>(org.springframework.http.HttpStatus.OK);
}