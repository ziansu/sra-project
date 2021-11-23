public void unoccupyRoom() {
    if ((this.occupiedRooms) > 0) {
        (this.occupiedRooms)--;
        (this.unoccupyRoom)++;
    }else {
        java.lang.System.out.println("there is no occupied room in this house");
    }
}