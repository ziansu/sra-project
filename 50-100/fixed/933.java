public java.lang.Thread addPerson(int sourceFloor, int destinationFloor) {
    (activePersons)++;
    floors[sourceFloor].addPerson();
    java.lang.Thread newPerson = new java.lang.Thread(new com.ru.usty.elevator.Person(sourceFloor, destinationFloor, this));
    newPerson.start();
    return newPerson;
}