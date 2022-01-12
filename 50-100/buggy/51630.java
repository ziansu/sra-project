@org.junit.Test
public void copyToExistingTargetInstance() {
    io.beanmapper.testmodel.person.Person person = createPerson();
    io.beanmapper.testmodel.person.PersonForm form = createPersonForm();
    person = beanMapper.map(form, person);
    org.junit.Assert.assertEquals(1984L, ((long) (person.getId())));
    org.junit.Assert.assertEquals("Truus", person.getName());
    org.junit.Assert.assertEquals("XHT-8311-t33l-llac", person.getBankAccount());
    org.junit.Assert.assertEquals("Den Haag", person.getPlace());
}