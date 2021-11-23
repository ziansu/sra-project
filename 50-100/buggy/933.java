public java.lang.Thread addPerson(int sourceFloor, int destinationFloor) {
    (activePersons)++;
    com.ru.usty.elevator.Person newPerson = new com.ru.usty.elevator.Person(sourceFloor, destinationFloor, this);
    floors[sourceFloor].addPerson(newPerson);
    java.lang.Thread newThread = new java.lang.Thread(new com.ru.usty.elevator.Person(sourceFloor, destinationFloor, this));
    newThread.start();
    return newThread;
}