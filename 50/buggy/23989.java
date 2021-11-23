@org.junit.Test
public void testIsPubliclyAvailable() {
    org.junit.Assert.assertFalse(getResource().isPubliclyAvailable());
}