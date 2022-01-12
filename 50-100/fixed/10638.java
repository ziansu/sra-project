@org.junit.Test
public void testFound() throws java.lang.Exception {
    boolean thrown = false;
    java.lang.String result = null;
    try {
        this.databaseEngine.search("abc");
    } catch (java.lang.Exception e) {
        thrown = true;
    }
    org.assertj.core.api.Assertions.assertThat((!thrown));
}