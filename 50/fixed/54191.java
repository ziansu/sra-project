@org.junit.Before
public void setUp() throws java.lang.Exception {
    controller = new wewoAPI.CommentsController();
    context = new ContextTest("Boris");
    mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    out = new java.io.ByteArrayOutputStream();
}