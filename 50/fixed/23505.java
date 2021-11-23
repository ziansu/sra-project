public void addPerson(elevator.Person person) {
    people.add(person);
    buttons.get(((person.getStopFloor()) - 1)).turnOn();
}