@java.lang.Override
public java.util.List<com.revature.domain.Person> getPersonByLastName(java.lang.String lastName) {
    java.util.List<com.revature.domain.Person> persons = personRepository.findByLastName(lastName);
    return persons;
}