@org.junit.Test
public void testCreateArtWithAllNullValues() {
    thrown.expect(exceptions.ConstraintViolationException.class);
    thrown.expectMessage(org.hamcrest.core.StringStartsWith.startsWith("Validation failed"));
    thrown.expectMessage(org.hamcrest.CoreMatchers.containsString("Artist name must be provided"));
    thrown.expectMessage(org.hamcrest.CoreMatchers.containsString("Art type must be provided"));
    thrown.expectMessage(org.hamcrest.CoreMatchers.containsString("Art name must be provided"));
    thrown.expectMessage(org.hamcrest.CoreMatchers.containsString("Please provide creation date or use right constructor"));
    dto.Art art = new dto.Art.ArtBuilder(null, null, null, null).build();
}