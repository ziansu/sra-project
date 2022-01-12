public java.util.ArrayList<Room> getAvailableRooms(java.util.Calendar s) {
    java.util.ArrayList<Room> available = new java.util.ArrayList<Room>();
    for (Room room : roomsInHotel) {
        if (checkAvailable(room, s))
            available.add(room);
        
    }
    return available;
}