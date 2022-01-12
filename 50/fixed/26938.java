@org.junit.Test
public void copyToNewTargetInstance() {
    io.beanmapper.testmodel.person.Person person = createPerson();
    io.beanmapper.testmodel.person.PersonView personView = beanMapper.map(person, io.beanmapper.testmodel.person.PersonView.class);
    assertEquals("Henk", personView.name);
    assertEquals("Zoetermeer", personView.place);
}