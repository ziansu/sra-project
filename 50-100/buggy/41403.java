@org.junit.Test
public void testCreateArtWithNullArtType() {
    thrown.expect(exceptions.ConstraintViolationException.class);
    thrown.expectMessage(org.hamcrest.core.StringStartsWith.startsWith("Validation failed"));
    thrown.expectMessage(org.hamcrest.CoreMatchers.containsString("Art type must be provided"));
    dto.Art art = new dto.Art.ArtBuilder("Mona lisa", null, "Leonard Di Vinci", java.time.LocalDate.now()).build();
}