@org.junit.Test
public void copyToNewTargetInstance() {
    io.beanmapper.testmodel.person.Person person = createPerson();
    io.beanmapper.testmodel.person.PersonView personView = beanMapper.map(person, io.beanmapper.testmodel.person.PersonView.class);
    org.junit.Assert.assertEquals("Henk", personView.name);
    org.junit.Assert.assertEquals("Zoetermeer", personView.place);
}