@java.lang.Override
public java.util.List<com.revature.domain.Person> getPersonByLastName(java.lang.String lastName) {
    return personRepository.findByLastName(lastName);
}