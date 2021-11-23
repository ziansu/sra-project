@org.junit.Test
public void testGetPerson() {
    java.lang.System.out.println("getPerson");
    entity.Person expResult = new entity.Person("Dan", "Mark");
    java.lang.System.out.println("person oprettet");
    expResult.setId(10L);
    java.lang.System.out.println("sat id til 10l");
    java.lang.Long personNumber = expResult.getId();
    entity.Person result = ((entity.Person) (fp.getPersonById(personNumber)));
    java.lang.System.out.println(("info på id" + result));
    assertNotSame(expResult, result);
}