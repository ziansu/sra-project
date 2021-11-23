public void delete(com.johnsimon.payback.data.Person person) {
    deleteDebts(person);
    deleted.add(person.id);
    peopleOrder.remove(person.id);
    touchPeopleOrder();
    people.remove(person);
    testPeopleOrder();
}