public elevator.Person getFromUpQueue() {
    elevator.Person person = null;
    person = upQueue.dequeue();
    if (upQueue.isEmpty()) {
        upButton.turnOff();
    }
    return person;
}