public void putPerson(cpsc433.Person p) throws cpsc433.Room.FullRoomException {
    if ((assignedPeople[0]) == null) {
        assignedPeople[0] = p;
    }else
        if ((assignedPeople[1]) == null) {
            assignedPeople[1] = p;
        }else {
            throw new cpsc433.Room.FullRoomException("Cannot assign more than 2 people to a room.");
        }
    
}