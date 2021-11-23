@org.junit.Test
public void testCustomFunction() throws java.lang.Exception {
    java.util.Map<java.lang.String, java.util.concurrent.Callable> fns = new java.util.HashMap<>();
    fns.put("setName", () -> "blahhh");
    net.pladform.random.ObjectGeneratorTest.MyObject2 a = objectGenerator.generate(net.pladform.random.ObjectGeneratorTest.MyObject2.class, fns);
    java.lang.System.out.println(a.getColor());
    org.junit.Assert.assertEquals("blahhh", a.getName());
}