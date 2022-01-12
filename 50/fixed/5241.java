@org.junit.Test
public void testFunctionVersion() {
    com.mijara.engine.Context context = com.mijara.engine.Jinl.load(new java.io.File("input/testFunctionVersion.jinl"));
    com.mijara.ast.Function function = context.getFunction("Main", "test");
    org.junit.Assert.assertEquals("test", function.getVersion());
}