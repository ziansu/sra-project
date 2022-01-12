public java.lang.Thread addPerson(int sourceFloor, int destinationFloor) {
    java.lang.Thread person = new java.lang.Thread(new com.ru.usty.elevator.Person(sourceFloor, destinationFloor, this));
    person.start();
    personCount.set(sourceFloor, ((personCount.get(sourceFloor)) + 1));
    return null;
}