@java.lang.SuppressWarnings(value = "unchecked")
public void removeTagTest() throws exceptions.EmptyFieldException, exceptions.InvalidDateException {
    ca.ualberta.cmput301w15t13.Models.Claim claim = new ca.ualberta.cmput301w15t13.Models.Claim("Name", new java.util.Date(1), new java.util.Date(2), null, null);
    java.lang.String tag = "test";
    claim.removeTag(tag);
    assertFalse("Tag was not removed", java.util.Arrays.asList(claim.getTags()).contains(tag));
}