@org.junit.Test
public void testGetPermutationStrongNameWithInvalidArguments1() throws javax.servlet.ServletException {
    try {
        servlet.getPermutationStrongName("asdf", null);
        junit.framework.Assert.fail("Expected exception did not occur");
    } catch (java.lang.IllegalArgumentException e) {
    }
}