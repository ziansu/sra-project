public Room getNearestRoom(List<Room> rooms) {
    nearest = null;
    for (room in : rooms)
        if (((nearest) == null) || ((this.distanceToRoom(room)) < (this.distanceToRoom(nearest))))
            nearest = room;
        
    
    return nearest;
}