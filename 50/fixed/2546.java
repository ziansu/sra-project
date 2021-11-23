public static java.lang.String roomTypeToString(model.rooms.Room.RoomType roomType) {
    if (roomType == null) {
        return "";
    }
    switch (roomType) {
        case model.rooms.Room.RoomType.UTILITY :
            return "სხვა";
        case model.rooms.Room.RoomType.AUDITORIUM :
            return "აუდიტორია";
    }
    return "";
}