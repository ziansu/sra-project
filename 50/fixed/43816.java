private void enterElevator(com.ru.usty.elevator.Elevator e) {
    if (e.addOccupant(this)) {
        currentElevator = e;
        scene.floors[currentFloor].removePerson();
    }
}