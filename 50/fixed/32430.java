@org.junit.Test
public void testInvalidContactId() {
    try {
        new impl.ContactImpl(0, "John");
        org.junit.Assert.fail();
    } catch (java.lang.IllegalArgumentException e) {
        org.junit.Assert.assertEquals(e.getMessage(), "ID must be a positive non-zero integer.");
    }
}