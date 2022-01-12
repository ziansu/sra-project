@org.junit.Test
public void testGetPermutationStrongNameWithInvalidArguments2() throws javax.servlet.ServletException {
    try {
        servlet.getPermutationStrongName(null, null, new java.util.HashSet<com.googlecode.mgwt.linker.server.BindingProperty>());
        junit.framework.Assert.fail("Expected exception did not occur");
    } catch (java.lang.IllegalArgumentException e) {
    }
}