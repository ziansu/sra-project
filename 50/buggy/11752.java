public java.lang.String addUser() {
    personService.addPerson(person);
    person = new jahidul.projectideas.ents.Person();
    return "User";
}