@org.junit.Test
public void testCreateArtWithNullArtistName() {
    thrown.expect(exceptions.ConstraintViolationException.class);
    thrown.expectMessage(org.hamcrest.core.StringStartsWith.startsWith("Validation failed"));
    thrown.expectMessage(org.hamcrest.CoreMatchers.containsString("Artist name must be provided"));
    new dto.Art.ArtBuilder("Mona lisa", constants.ArtType.PAINTING, null, java.time.LocalDate.now()).build();
}