@org.junit.Test
public void addPersonTest() {
    domain.PersonDomainModel per1;
    per1 = base.PersonDAL.getPerson(base.Person_Test.sample1.getPersonID());
    assertNull("The per1 shouldn't have been in the database", per1);
    base.PersonDAL.addPerson(base.Person_Test.sample1);
    per1 = base.PersonDAL.getPerson(base.Person_Test.sample1.getPersonID());
    java.lang.System.out.println(((base.Person_Test.sample1.getPersonID()) + " found"));
    assertNotNull("The Person should have been added to the database", per1);
}