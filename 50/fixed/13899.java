public void add(com.johnsimon.payback.data.Person person) {
    peopleOrder.add(person.id);
    people.add(person);
    touchPeopleOrder();
}