@org.junit.Test
public void copyToExistingTargetInstance() {
    io.beanmapper.testmodel.person.Person person = createPerson();
    io.beanmapper.testmodel.person.PersonForm form = createPersonForm();
    person = beanMapper.map(form, person);
    assertEquals(1984L, ((long) (person.getId())));
    assertEquals("Truus", person.getName());
    assertEquals("XHT-8311-t33l-llac", person.getBankAccount());
    assertEquals("Den Haag", person.getPlace());
}