@org.junit.Test
public void testGetErrorMessage_customErrorsShownIfPresent() {
    when(settings.getString("errorMessage.COMMIT_REGEX")).thenReturn("more info");
    java.util.List<com.isroot.stash.plugin.errors.YaccError> errors = new java.util.ArrayList<>();
    errors.add(new com.isroot.stash.plugin.errors.YaccError(YaccError.Type.COMMIT_REGEX, "commit error"));
    java.lang.String message = yaccErrorBuilder.getErrorMessage(errors);
    org.assertj.core.api.Assertions.assertThat(message).isEqualTo(((((((com.isroot.stash.plugin.errors.YaccErrorBuilder.ERROR_BEARS) + "\n\n") + "commit error\n") + "\n") + "    more info\n") + "\n"));
}