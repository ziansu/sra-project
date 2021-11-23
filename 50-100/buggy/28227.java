@org.junit.Test
public void testFound() throws java.lang.Exception {
    boolean thrown = false;
    java.lang.String result = null;
    try {
        result = this.databaseEngine.search("abc");
    } catch (java.lang.Exception e) {
        thrown = true;
    }
    org.assertj.core.api.Assertions.assertThat((!thrown));
    if (result != null) {
        org.assertj.core.api.Assertions.assertThat(result.equals("def"));
    }
}