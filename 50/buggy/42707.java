public elevator.Person getFromUpQueue() {
    elevator.Person person = null;
    if (upIsOn()) {
        person = upQueue.dequeue();
        if (upQueue.isEmpty()) {
            upButton.turnOff();
        }
    }
    return person;
}