public int getRoomCost() {
    int roomCost = 0;
    if ((roomType) == 'I')
        roomCost = (HospitalMVC.Patient.icRoomRate) * (days);
    else
        if ((roomType) == 'P')
            roomCost = (HospitalMVC.Patient.privateRoomRate) * (days);
        else
            roomCost = (HospitalMVC.Patient.doubleRoomRate) * (days);
        
    
    return roomCost;
}