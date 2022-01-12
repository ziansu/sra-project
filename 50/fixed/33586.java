@org.junit.Test
public void testFindAccountNonExistent() {
    edu.csbsju.Account expResult = null;
    assertEquals(("Exists in the database: " + expResult), expResult, db1.findAccount("hgil"));
}