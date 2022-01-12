public java.lang.String getHoverText() {
    if ((this.roomInfo) != null) {
        return java.lang.String.format("Room Name: %1s\nRoom Coordinates: X:%2$d Y:%3$d Z:%4$d", this.roomInfo.StructureName.getName(), this.roomInfo.RoomCoordinates.getX(), this.roomInfo.RoomCoordinates.getY(), this.roomInfo.RoomCoordinates.getZ());
    }
    return "";
}