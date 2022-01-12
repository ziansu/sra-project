public void setData(Models.Room room) {
    this.id = room.getId();
    this.roomName = room.getName();
    name.setText(this.roomName);
    this.roomsController = room.getRoomsController();
}