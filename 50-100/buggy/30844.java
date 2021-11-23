public void moveElevator(elevator.FloorArray floors, elevator.Elevator[] elevators) {
    for (int elevator = 0; elevator < (elevators.length); elevator++) {
        elevator.Elevator currentElevator = elevators[elevator];
        for (int floor = 0; floor < (floors.getSize()); floor++) {
            elevator.Floor currentFloor = floors.getFloor(floor);
            currentElevator.addPerson(currentFloor.getFromUpQueue());
            currentElevator.removePerson(floor);
        }
    }
}