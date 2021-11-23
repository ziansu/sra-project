@org.junit.Test
public void testGetErrorMessage_defaultHeaderShownIfCustomizedHeaderIsEmpty() {
    when(settings.getString("errorMessageHeader")).thenReturn("");
    java.lang.String message = yaccErrorBuilder.getErrorMessage(new java.util.ArrayList<com.isroot.stash.plugin.errors.YaccError>());
    org.assertj.core.api.Assertions.assertThat(message).isEqualTo(((com.isroot.stash.plugin.errors.YaccErrorBuilder.ERROR_BEARS) + "\n\n"));
    verify(settings).getString("errorMessageHeader");
}