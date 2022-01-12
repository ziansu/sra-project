@org.junit.Test
public void calling_java_varargs_method_should_be_possible() throws java.lang.Exception {
    final bsh.Interpreter interpreter = new bsh.Interpreter();
    interpreter.set("helper", new bsh.VarargsTest.ClassWithVarargMethods());
    @java.lang.SuppressWarnings(value = { "unchecked" })
    final java.util.List<java.lang.Object> list = ((java.util.List<java.lang.Object>) (interpreter.eval("helper.list(1,2,3)")));
    org.junit.Assert.assertEquals(java.util.Arrays.asList(new java.lang.Object[]{ 1 , 2 , 3 }), list);
}