@org.junit.Test
public void testNullItems() {
    java.lang.Object[] objArray = new java.lang.Object[]{ null , null , null };
    assertTrue(seedu.addressbook.common.Utils.isAnyNull(objArray));
}