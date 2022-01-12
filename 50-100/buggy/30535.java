@org.junit.Test
public void testCreateArtWithNullName() {
    thrown.expect(exceptions.ConstraintViolationException.class);
    thrown.expectMessage(org.hamcrest.core.StringStartsWith.startsWith("Validation failed"));
    thrown.expectMessage(org.hamcrest.CoreMatchers.containsString("Art name must be provided"));
    dto.Art art = new dto.Art.ArtBuilder(null, constants.ArtType.PAINTING, "Leonard Di Vinci", java.time.LocalDate.now()).build();
}