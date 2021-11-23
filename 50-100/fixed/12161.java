public int getRoomCost() {
    int roomCost = 0;
    switch (roomType) {
        case 'I' :
            roomCost = (HospitalMVC.Patient.icRoomRate) * (days);
            break;
        case 'P' :
            roomCost = (HospitalMVC.Patient.privateRoomRate) * (days);
            break;
        default :
            roomCost = (HospitalMVC.Patient.doubleRoomRate) * (days);
            break;
    }
    return roomCost;
}