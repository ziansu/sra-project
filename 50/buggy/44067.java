public void savePerson(com.hr.project.entity.Person person) {
    person.setId(com.hr.project.service.PersonServiceImpl.counter.incrementAndGet());
    com.hr.project.service.PersonServiceImpl.persons.add(person);
    personDAO.savePerson(person);
    java.lang.System.out.println("sht");
}