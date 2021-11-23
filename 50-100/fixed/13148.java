public Room getNearestRoom(java.util.List<Room> rooms) {
    Room nearest = null;
    for (Room room : rooms)
        if ((nearest == null) || ((this.distanceToRoom(room)) < (this.distanceToRoom(nearest))))
            nearest = room;
        
    
    return nearest;
}