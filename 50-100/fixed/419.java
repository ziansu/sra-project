@org.junit.Test
public void testGetPerson() {
    entity.Person expResult = new entity.Person("Dan", "Mark");
    expResult.setId(10L);
    java.lang.Long personNumber = expResult.getId();
    entity.Person result = ((entity.Person) (fp.getPersonById(personNumber)));
    assertNotSame(expResult, result);
}