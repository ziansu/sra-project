@org.junit.Test
public void testCustomFunction() throws java.lang.Exception {
    java.util.Map<java.lang.String, java.util.concurrent.Callable> fns = new java.util.HashMap<>();
    fns.put("setName", new java.util.concurrent.Callable() {
        @java.lang.Override
        public java.lang.Object call() throws java.lang.Exception {
            return "blahhh";
        }
    });
    net.pladform.random.ObjectGeneratorTest.MyObject2 a = objectGenerator.generate(net.pladform.random.ObjectGeneratorTest.MyObject2.class, fns);
    org.junit.Assert.assertEquals("blahhh", a.getName());
}