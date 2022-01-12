@org.junit.Test
public void testEmptyMessage() {
    teaselib.test.TestScript script = teaselib.test.TestScript.getOne(getClass());
    teaselib.Message message = new teaselib.Message(script.actor);
    script.setImage("foobar.jpg");
    teaselib.Message parsed = script.injectImagesAndExpandTextVariables(message);
    teaselib.Message.Parts parts = parsed.getParts();
    int n = 0;
    assertEquals(Type.Image, parts.get(n).type);
    assertEquals(parts.size(), 1);
}