@org.junit.Test
public void testCreateArtWithNullCreationDate() {
    thrown.expect(exceptions.ConstraintViolationException.class);
    thrown.expectMessage(org.hamcrest.core.StringStartsWith.startsWith("Validation failed"));
    thrown.expectMessage(org.hamcrest.CoreMatchers.containsString("Please provide creation date or use right constructor"));
    new dto.Art.ArtBuilder("Mona lisa", constants.ArtType.PAINTING, "Leonard Di Vinci", null).build();
}