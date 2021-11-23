@org.junit.Test
public void testGetErrorMessage_multipleErrors() {
    java.util.List<com.isroot.stash.plugin.errors.YaccError> errors = new java.util.ArrayList<>();
    errors.add(new com.isroot.stash.plugin.errors.YaccError("commit error"));
    errors.add(new com.isroot.stash.plugin.errors.YaccError("another error"));
    java.lang.String message = yaccErrorBuilder.getErrorMessage(errors);
    org.assertj.core.api.Assertions.assertThat(message).isEqualTo(((((((com.isroot.stash.plugin.errors.YaccErrorBuilder.ERROR_BEARS) + "\n\n") + "commit error\n") + "\n") + "another error\n") + "\n"));
}